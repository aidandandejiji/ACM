package com.qst02.Demo02;

import java.util.Arrays;
import java.util.Scanner;
//纪念奖品  最多两个一组 每一组的钱不超过100 怎么分组最少
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = sc.nextInt();

        int[] f = new int[x];

        for (int i = 0; i < f.length; i++) {
            f[i] = sc.nextInt();
        }
        Arrays.sort(f);
        int ans = 0;
        int pre = 0;
        int next = x-1;
        while(pre <= next){
            if(f[pre]+f[next] <=n){
                ++ans;
                pre++;
                next--;
            }else {
                next--;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
