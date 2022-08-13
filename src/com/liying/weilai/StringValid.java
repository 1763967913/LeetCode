package com.liying.weilai;

import java.util.Stack;

/**
 * @author YingLi
 * @create 2022-08-09 20:22
 */
public class StringValid {
    public static void main(String[] args) {
        System.out.println(new StringValid().stringIsVaild("<a(a)a>"));
    }

    boolean stringIsVaild(String s){
        if(s.isEmpty()) return false;
        if(s.charAt(0) != '<') return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if ('<' == c || '(' == c){
                stack.push(c);
            } else if ('>' == c || ')' == c){
                if(stack.peek() == leftOfChar(c)){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    char leftOfChar(char c){
        if (c == '>'){
            return '<';
        }
        return  '(';
    }
}
