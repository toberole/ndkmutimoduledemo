# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

################################### 公共配置 #############################


################################### 多moudle配置 #############################
# 设置so输出位置
# set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${PROJECT_SOURCE_DIR}/../jniLibs/${ANDROID_ABI})

# 引入module_1模块
ADD_SUBDIRECTORY(src/main/cpp/module_1)

# 引入module_2模块
# ADD_SUBDIRECTORY(src/main/cpp/module_2)





