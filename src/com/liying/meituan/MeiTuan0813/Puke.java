package com.liying.MeiTuan;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Puke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        LinkedList<Integer> originList = getOriginList(nums);
        for (Integer num: originList) {
            System.out.print(num);
        }
        System.out.println();
    }
    static LinkedList<Integer> getOriginList(int[] nums){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = nums.length - 1; i >= 0; i--){
            list.addFirst(nums[i]);
            list.addFirst(list.remove(list.size() - 1));
            list.addFirst(list.remove(list.size() - 1));
        }
        return list;
    }
}
