package com.liying.easy;

import org.junit.Test;

/**
 * @author YingLi
 * @create 2022-03-28 21:41
 */
public class Solution {


    @Test
    public void test01() {
        int[] index = twoSum(new int[]{3,2,4}, 6);
        for (int i : index) {
            System.out.println(i);
        }
    }

    @Test
    public void test02(){
        int i = lineNumber(20, 2, 5);
        System.out.println(i);
    }


    /**
     * 两数相加
     * @param sums
     * @param target
     * @return
     */

    public int[] twoSum(int[] sums, int target){
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

    /**
     * 编程题
     * 问题：约瑟夫问题
     * 描述：n个小朋友，从第k个开始报数，报到第m个出队，下一个小朋友继续从1报数，报到第m个出队...
     * 输出：出队编号
     * @param n 一共有多少孩子
     * @param k 开始报数的孩子编号
     * @param m 报数的最大号码
     * @return
     */
    public int lineNumber(int n,int k,int m){
        int number = 0;
        n = n - 1;
        k = (m+k) % n;
        number = k + m - 1;

        return number;
    }



}
