package com.liying.meituan.MeiTuan0813;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TreeTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nodes = new int[n];
        for (int i = 0; i < n; i++){
            nodes[i] = sc.nextInt();
        }
        int max = getMax(nodes,0);
        System.out.println(max);

    }

    static int getMax(int[] nodes, int start){
        int res = Integer.MIN_VALUE;
        if (start >= nodes.length){
            return res;
        }
        res = Math.max(getMax(nodes,2 * start),getMax(nodes,2 * start + 1));
        return res + nodes[start];
    }
}

