package com.liying.easy;

/**
 * @author YingLi
 * @create 2022-03-28 21:41
 */
public class Solution {


    public static void main(String[] args) {
        int[] index = twoSum(new int[]{3,2,4}, 6);
        for (int i : index) {
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] sums, int target){
        for (int i = 0;i < sums.length;i++){
            int b = target - sums[i];
            for (int j = i+1;j < sums.length;j++){
                System.out.println(sums[j]);
                if (b == sums[j]);
                return new int[]{i,j};
            }
        }
        return null;
    }



}
