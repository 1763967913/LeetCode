package com.liying.MeiTuan;

import java.util.Arrays;
import java.util.Scanner;

public class Roboot {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] room = new int[n][m];
        for (int i = 0; i < n;i++){
            Arrays.fill(room[i],0);
        }
        room[0][0] = 1;
        String orders_str = sc.next();
        char[] orders = orders_str.toCharArray();

        int orderNum = cleanRoom(room, orders);

//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                if (room[i][j] == 1){
//                    count++;
//                }
//            }
//        }

        int no = n*m - orderNum - 1;
        if (no == 0){
            System.out.println("Yes");
            System.out.println(orderNum);
        } else{
            System.out.println("No");
            System.out.println(no);
        }
    }

    static int cleanRoom(int[][] room,char[] orders){
        int i = 0, j = 0;
        int order = 0;
        while(i < room.length - 1 && j < room[0].length - 1){
            for(int k = 0; k < orders.length; k++){
                if(orders[k] == 'W'){
                    i--;
                    if (room[i][j] == 0){
                        room[i][j] = 1;
                        order++;
                    } else{
                        continue;
                    }

                } else if(orders[k] == 'A'){
                    j--;
                    if (room[i][j] == 0){
                        room[i][j] = 1;
                        order++;
                    } else{
                        continue;
                    }

                } else if(orders[k] == 'S'){
                    i++;
                    if (room[i][j] == 0){
                        room[i][j] = 1;
                        order++;
                    } else {
                        continue;
                    }
                } else{
                    j++;
                    if (room[i][j] == 0){
                        room[i][j] = 1;
                        order++;
                    } else {
                        continue;
                    }

                }
            }
        }
        return order;
    }
}
