package com.liying.MeiTuan;

import java.util.Scanner;

public class YuanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrs = new int[n];
        for (int i = 0; i < n; i++){
            arrs[i] = sc.nextInt();
        }

        System.out.println(getYuan(arrs));


    }
    static int getYuan(int[] arrs){
        int res = 0;
        for (int i = 0; i < arrs.length; i++){
            for (int j = i + 1; j < arrs.length; j++){
                for (int k = j + 1; k < arrs.length; k++){
                    if(arrs[i] - arrs[j] == 2 * arrs[j] - arrs[k]){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
