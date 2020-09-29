package com.website.orange;

import com.website.orange.annotation.MyAnnotation;
import com.website.orange.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


@SpringBootTest
public class OrangeApplicationTests {

    @Test
    void context() {
        List<String> list = Arrays.asList("1","2","3","4");
        List<String> collect = list.stream().filter(x -> x.equals("2")).collect(Collectors.toList());
        List<String> collect1 = list.stream().map(x -> x + 1).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
    }

    @Test
    void test1(){
        List<User> list = Arrays.asList(new User("海皇",23),new User("小潮",25));
        list.forEach(el -> swagger(el));
        list.forEach(this::swagger);
//        Consumer<User> methodParam = this::swagger;
//        list.forEach(x ->methodParam.accept(x));
    }

    public void swagger(User value){
        System.out.println(value.getName());
    }

    @Test
    void test2()throws Exception{
        User user = new User();
        Class<User> c = User.class;
        Method mSomeBody = c.getMethod("somebody", String.class, int.class);
//        mSomeBody.invoke(user,new Object[]{"lisa",18});
        iteratorAnnotation(mSomeBody);

        //获取empty方法
        Method mEmpty = c.getMethod("empty",new Class[]{});
        //执行该方法
//        mEmpty.invoke(user,new Object[]{});
        iteratorAnnotation(mEmpty);
    }

    public static void iteratorAnnotation(Method method){
        //判断somebody方法是否包含myAnnotation注解
        if(method.isAnnotationPresent(MyAnnotation.class)){
            //获取该方法的注解实例
            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            //获取myAnnotation注解的值并打印出来
            String[] values = myAnnotation.value();
            for(String str:values){
                System.out.println(str);
            }
        }

        //获取方法上的所有注解
        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation:
             annotations) {
            System.out.println(annotation);
        }
    }

    @Test
    public void test3(){
        Integer i = 100;
        Character c = '1';
        i = i << 3;
        System.out.println(i);
    }

}
