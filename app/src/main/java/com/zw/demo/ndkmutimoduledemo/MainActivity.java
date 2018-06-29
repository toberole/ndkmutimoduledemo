package com.zw.demo.ndkmutimoduledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.zw.demo.ndkmutimoduledemo.jnidemo.Demo;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("AAAA",""+ Demo.add(2,4));
    }

}
