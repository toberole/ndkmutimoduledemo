# Sets the minimum version of CMake required to build the native library.
cmake_minimum_required(VERSION 3.4.1)

# 设置生成so库的位置
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${PROJECT_SOURCE_DIR}/../jniLibs/${ANDROID_ABI})


######################## include_directories 命令 ########################
# 命令语法：include_directories([AFTER|BEFORE] [SYSTEM] dir1 dir2 …)
# 命令简述：用于设定目录，这些设定的目录将被编译器用来查找 include 文件
# 使用范例：include_directories(${PROJECT_SOURCE_DIR}/lib)
# include_directories(./../include)

######################## 构建源文件 方案一 ########################
# 获取 当前目录 下面的所有源文件 保存到 all_source 变量中
file(GLOB all_source *.cpp *.c *.cc)

######################## 构建源文件 方案二 ########################
# 将指定 dir 目录下的所有源文件的名字保存在变量 DIR_SRCS 中
# aux_source_directory(./src DIR_SRCS)


######################## 构建库 ########################
# 库名称：native-lib
add_library( moudle_one
             SHARED
             ${all_source})


######################## 引入第三方库 ########################
# 引入libs目录中第三方的libopencv_java.so库
# add_library(   lib_opencv
#                SHARED
#                IMPORTED)
# set_target_properties(lib_opencv
#                          PROPERTIES IMPORTED_LOCATION
#                          ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_java.so)



find_library( # Sets the name of the path variable.
              log-lib

              # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )


target_link_libraries( # Specifies the target library.
                       moudle_one

                       # Links the target library to the log library
                       # included in the NDK.
                       ${log-lib} )