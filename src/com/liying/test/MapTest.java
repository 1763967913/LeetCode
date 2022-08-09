package com.liying.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YingLi
 * @create 2022-08-08 20:41
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer,Integer> freq = new HashMap<>();
        System.out.println(freq.getOrDefault(1, 0));
        freq.entrySet();
    }
}
