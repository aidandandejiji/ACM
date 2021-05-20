package com.qst.demo06;

import java.util.Scanner;
//模拟一个点在二维坐标系上的运动
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.hasNext();
        int y = scanner.nextInt();
        int number = scanner.nextInt();
        int[][] a = new int[number][2];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            switch (a[i][0]) {
                case 0:
                    y += a[i][1];
                    break;
                case 1:
                    x += a[i][1];
                    break;
                case 2:
                    y -= a[i][1];
                    break;
                case 3:
                    x -= a[i][1];
                    break;
                default:
                    break;
            }

        }
        System.out.println(x+" "+y);
    }
}
