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
        //the method test is annotated to accept only values 1,2,3
        //This would still compile and genrate the class and object codes but would throw a compilation error to the IDE
        Log.e("return"," "+objectClass.test(4));//NO I18N
        Log.e("return"," "+objectClass.test(3));//NO I18N

    }


}
