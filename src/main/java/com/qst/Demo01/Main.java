package com.qst.Demo01;

//分发金币 第一天一个 第二天第三天俩  第三天第四天第五天三
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        for (int i = 1; i <= k; i++) {
            count++;
            sum += count * count;
            i = i + count - 1;
            while (i > k) {
                sum -= (i - k) * count;
                break;
            }

        }
        System.out.println(sum);
    }
}
//            int j = 0;
//            for (j = 1; j <= count && i <= k; j++) {
//                i++;
//                sum = sum + count;
//            }