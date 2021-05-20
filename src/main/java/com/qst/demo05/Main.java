package com.qst.demo05;

import java.util.Scanner;
//例如11月初津津手中还有83元，妈妈给了津津300元。津津预计11月的花销是180元，那么她就会在妈妈那里存200元，自己留下183元。到了11月月末，津津手中会剩下3元钱。
//        津津发现这个储蓄计划的主要风险是，存在妈妈那里的钱在年末之前不能取出。有可能在某个月的月初，津津手中的钱加上这个月妈妈给的钱，不够这个月的原定预算。如果出现这种情况，津津将不得不在这个月省吃俭用，压缩预算。
//        现在请你根据2004年1月到12月每个月津津的预算，判断会不会出现这种情况。如果不会，计算到2004年年末，妈妈将津津平常存的钱加上20％还给津津之后，津津手中会有多少钱。
public class Main {
    public static void main(String[] args) {
        int[] a = new int[12];//津津每个月的预算
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(sum(a));
    }
    public static int sum(int[] a){
        int x = 300;//妈妈每个月给的钱
        int money = 0;//津津每个月开始手中有的钱
        int save = 0;//津津存在妈妈那的钱
        int last = 0;//津津每个月底剩的钱
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            money = x + last;
            last = money - a[i];
            while (last >= 100) {
                last -= 100;
                save += 100;
            }
            if (last < 0) {
               return -(i+1);
            }
        }
        sum = (int) (last + save * (1.2));
        return sum;
    }
}
