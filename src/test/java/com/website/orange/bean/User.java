package com.website.orange.bean;

import com.website.orange.annotation.MyAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zxl
 * @Description:
 * @date 2020/9/1813:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;

    private Integer age;

    @MyAnnotation
    @Deprecated
    public void empty(){
        System.out.println("\nempty");
    }

    @MyAnnotation(value = {"girl","boy"})
    public void somebody(String name,int age){
        System.out.println("\nsomebody:"+name+","+age);
    }
}
