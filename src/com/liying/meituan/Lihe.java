package com.liying.meituan;

import java.util.Scanner;

/**
 * @author YingLi
 * @create 2022-08-13 14:03
 */
public class Lihe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            int count = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            while (x > 0 && y > 0){
                x--;
                y--;
                if(x > y){
                    count++;
                    x--;
                } else{
                    count++;
                    y--;
                }
            }
            res[i] = count;
        }
        for(int i = 0; i < n; i++){
            System.out.println(res[i]);
        }
    }
}
