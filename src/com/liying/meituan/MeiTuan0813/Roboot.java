package com.liying.meituan.MeiTuan0813;

import java.util.Arrays;
import java.util.Scanner;

public class Roboot{
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        String[] line = cin.nextLine().split(" ");
        int n = Integer.parseInt(line[0]), m = Integer.parseInt(line[1]), k = Integer.parseInt(line[2]);
        String orders = cin.nextLine();
        int[][] room = new int[n][m];
        room[0][0] = 1;
        int count = 1, x = 0, y = 0;
        for (int i = 0; i < orders.length(); i++) {
            char ch = orders.charAt(i);
            if (ch == 'W') x--;
            else if (ch == 'A') y--;
            else if (ch == 'S') x++;
            else y++;
            if (room[x][y] == 0) {
                room[x][y] = 1;
                count++;
            }
            if (count == n * m) {
                System.out.println("Yes");
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("No");
        System.out.println(n * m - count);
    }
}