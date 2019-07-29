package com.as.test.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * desc:
 * author: as
 * date: 2019/7/29
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Animal {
    int lag() default 0;
}
