package com.sk.Reflection;

import javax.management.ObjectName;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
//        Class clazz = Student.class;
//        Object obj = clazz.newInstance();
//        Method method = clazz.getDeclaredMethod("greeting");
//        method.invoke(obj);
        
        Class<?> cls = null;
        try {
            cls = Class.forName("com.sk.Reflection.Student");
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method m =  cls.getDeclaredMethod("greeting");
            m.setAccessible(true);
            m.invoke(obj);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
