package com.example.jenison_3631.anotationtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestObjectClass objectClass=new TestObjectClass();
        Log.e("return"," "+objectClass.test(3));
    }


}