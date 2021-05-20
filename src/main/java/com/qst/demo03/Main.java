package com.qst.demo03;

import java.util.Scanner;
//对给定的一个区间 求含有数字2的数字个数
public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.hasNext();
        int y = scanner.nextInt();
        for (int i = x; i <= y; ) {
            while (i > 0) {
                if (i % 10 == 2) {
                    count++;
                }
                i = i / 10;
            }
            x++;
            i = x;
        }
        System.out.println(count);
    }
}
