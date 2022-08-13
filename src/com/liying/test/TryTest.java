package com.liying.test;

import java.lang.reflect.Method;

/**
 * @author YingLi
 * @create 2022-08-11 14:39
 */
public class TryTest {
    public static int method(){
        int a = 1;
        try{
            System.out.println("nihao");
            return a;
        } finally {
            System.out.println("shijie");
            a = 2;
        }
    }

    public static void main(String[] args) {
        int res = method();
        System.out.println(res);
    }

}
