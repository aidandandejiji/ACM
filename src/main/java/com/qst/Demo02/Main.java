package com.qst.Demo02;

import java.util.Scanner;

//数字反转(数字范围为-10000到+1000000)
public class Main {
    public static void main(String[] args) {
        int x, a;
        x = new Scanner(System.in).nextInt();
        if (x > 0) {
            a = change(x);
            System.out.println(a);
        } else if (x < 0){
            a=change(-x);
            System.out.println(-a);
        }
    }
    public static int change(int x) {
        String s = "";
        while (x != 0) {
            if (s.equals("") && x % 10 == 0) {
                x = x / 10;
            }
            s = s + x % 10;
            x = x / 10;
        }
        return Integer.parseInt(s);
    }
}
