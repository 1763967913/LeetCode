package com.liying.test;

import java.util.*;

/**
 * @author YingLi
 * @create 2022-08-07 20:16
 */
public class QueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue  = new PriorityQueue<>();
        queue.offer(1);

        List<List<Integer>> list = new LinkedList<>();
        list.get(0);
        list.get(1);
        Iterator<List<Integer>> iterator = list.iterator();
        while(iterator.hasNext()){
            List<Integer> list1 = iterator.next();
            list1.add(1);
        }
        final List<int[]> ints = Arrays.asList(new int[]{1, 2, 3});


    }
}
