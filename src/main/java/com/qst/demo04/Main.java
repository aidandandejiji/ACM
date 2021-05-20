package com.qst.demo04;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

//判断一个正整数的 两个质数相乘等于这个正整数 输出这两个质数中大的一个
public class Main {
    public static void main(String[] args) {
        int a, i, max;
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        for (i = 2; i < sqrt(a); i++) {
            if (a % i == 0) {
                j = a / i;
                break;
            }
        }
        if (i > j) {
            max = i;
        } else {
            max = j;
        }
        System.out.println(max);
    }
}

//        暴力解法
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        for (int i = 1; i < sqrt(x); i++) {
//            if (judge(x / i) != 0)
//                for (int j = x; j > i; j--) {
//                    if (i * j == x) {
//                        if (judge(i) != 0 && judge(j) != 0) {
//                            System.out.println(i > j ? i : j);
//                        }
//                    }
//                }
//        }
//    }
//
//    public static int judge(int a) {
//        for (int i = 2; i < a; i++) {
//            for (int j = 2; j < a; j++) {
//                if (i * j == a) {
//                    return 0;
//                }
//            }
//        }
//        return a;
//    }



