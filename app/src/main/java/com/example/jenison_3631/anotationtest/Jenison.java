package com.example.jenison_3631.anotationtest;

import android.support.annotation.IntDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by jenison-3631 on 22/06/17.
 */

@Target({ElementType.PARAMETER})
@IntDef({1,2,3})
public @interface Jenison {
}
