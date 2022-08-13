package com.liying.meituan;



import java.util.Scanner;

/**
 * @author YingLi
 * @create 2022-08-13 13:09
 */
public class PreString {
    static String getString(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.append(sb.reverse()).append("wow");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];
        String source_str = "wowMeiTuannauTieMwow";
        int n = source_str.length();
        for(int i = 0; i < num; i++){
            nums[i] = sc.nextInt();
        }
        for(int i = 0; i < num; i++){
            int idx = (nums[i] + 3) % n;
            if(idx == 0){
                System.out.println('w');
                continue;
            }
            System.out.println(source_str.charAt(idx - 1));
        }
    }
}
