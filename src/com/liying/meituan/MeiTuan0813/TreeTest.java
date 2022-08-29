package com.liying.meituan.MeiTuan0813;

import java.util.*;

public class TreeTest{
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n =  Integer.parseInt(cin.nextLine());
        String[] _nums = cin.nextLine().split(" ");
        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) nums[i] = Integer.parseInt(_nums[i - 1]);
        int ans = 0;
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        while (!q.isEmpty()) {
            int t = q.poll();
            ans = Math.max(ans, nums[t]);
            if (2 * t <= n){
                nums[2 * t] += nums[t];
                q.offer(2 * t);
            }
            if (2 * t + 1 <= n) {
                nums[2 * t + 1] += nums[t];
                q.offer(2 * t + 1);
            }
        }
        System.out.println(ans);
    }
}

