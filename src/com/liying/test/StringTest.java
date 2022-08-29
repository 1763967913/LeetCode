package com.liying.test;

/**
 * @author YingLi
 * @create 2022-08-06 19:13
 */
public class StringTest {

    public static void main(String[] args) {
//        String s1 = new String("a") + new String("b");
//        String s2 = "abccba";
//        System.out.println(s2.substring(0, 6));

//        String s3 = s1.intern();
//        System.out.println(s1.hashCode() == s2.hashCode());
//        System.out.println(s1 == s3);
//        System.out.println(s2 == s3);

//        char c = s2.charAt(1);

        int[] array = new int[128];
        array['c'] = 0;
        System.out.println('c' - 97);

        StringBuilder sb = new StringBuilder();
        sb.deleteCharAt(1);

        int number = 68;
        char chart = (char)number;
        System.out.println("number = " + number);
        System.out.println("chart = " + chart);
    }
}
