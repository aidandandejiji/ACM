package com.qst02.Demo04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();

        int[] people=new  int[x];
        for (int i = 0; i < x; i++) {
            people[i]=scanner.nextInt();
        }
        int[] number=new  int[y];
        int a=0;
        int time=0;
        for (int i = 0; i < number.length; i++) {
            number[i]=people[a];
            a++;
        }
        while (a<x)
        {
            Arrays.sort(number);
            while (number[0]>0)
            {
                for (int i = 0; i < number.length; i++) {
                    number[i]--;
                }
                time++;
            }
            number[0]=people[a];
            a++;
        }
        Arrays.sort(number);
       time=number[number.length-1]+time;
        System.out.println(time);
    }
}
