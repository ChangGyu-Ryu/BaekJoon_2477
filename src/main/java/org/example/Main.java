package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //2-1. String ans = "";
        char[] ans = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //int dist = ch - 'A'
            //int dist_ASCll = 'a' + dist
            if('A' <= ch && ch <= 'Z')
                //1-1.System.out.print((char)('a' + ch - 'A'));
                //2-2.ans += (char)('a' + ch - 'A');
                ans[i] = (char)('a' + ch - 'A');
            else
                //1-2.System.out.print((char)('A' + ch - 'a'));
                //2-3.ans += (char)('A' + ch - 'a');
                ans[i] = (char)('A' + ch - 'a');
        }
        System.out.println(ans);




    }
}