package com.website.orange.annotation;

import java.lang.annotation.*;

/**
 * @author zxl
 * @Description:
 * @date 2020/9/2010:25
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface MyAnnotation {

    String[] value() default "unknown";
}
