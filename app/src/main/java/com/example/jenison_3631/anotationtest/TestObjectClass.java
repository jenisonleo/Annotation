package com.example.jenison_3631.anotationtest;

import android.util.Log;

import java.util.Random;

/**
 * Created by jenison-3631 on 22/06/17.
 */

public class TestObjectClass {

    @Jenison(value = 1)
    public int test( int x){
        Jenison number = null;
        try {
             number = getClass().getMethod("test", TestObjectClass.class).getAnnotation(Jenison.class);
        } catch (NoSuchMethodException e) {
            Log.e("excepton"," ");
        }
        Random random=new Random();
        int xx=random.nextInt(2);
        return xx+number.value();
    }
}
