package com.qst02.Demo01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int [][] a=new int[n][3];
        for (int i = 0; i < n; i++) {
            a[i][0]=i+1;
            a[i][1]=r.nextInt();
            int x=r.nextInt();
            int y=r.nextInt();
            a[i][2]=a[i][1]+x+y;
        }
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i; j < a.length; j++) {
                if(a[i][2]>a[j][2])
                {
                    int temp=a[i][0];
                    a[i][0]=a[j][0];
                    a[j][0]=temp;

                    temp=a[i][1];
                    a[i][1]=a[j][1];
                    a[j][1]=temp;

                    temp=a[i][2];
                    a[i][2]=a[j][2];
                    a[j][2]=temp;
                }

            }
        }

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i; j < a.length; j++) {
                if(a[i][2]==a[j][2]&&a[i][1]>a[j][1])
                {
                    int temp=a[i][0];
                    a[i][0]=a[j][0];
                    a[j][0]=temp;

                    temp=a[i][1];
                    a[i][1]=a[j][1];
                    a[j][1]=temp;

                    temp=a[i][2];
                    a[i][2]=a[j][2];
                    a[j][2]=temp;
                }

            }
        }

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i; j < a.length; j++) {
                if(a[i][2]==a[j][2]&&a[i][1]==a[j][1]&&a[i][0]<a[j][0])
                {
                    int temp=a[i][0];
                    a[i][0]=a[j][0];
                    a[j][0]=temp;

                    temp=a[i][1];
                    a[i][1]=a[j][1];
                    a[j][1]=temp;

                    temp=a[i][2];
                    a[i][2]=a[j][2];
                    a[j][2]=temp;
                }
            }
        }
        for (int i = a.length-1; i >a.length-6; i--) {
            System.out.println(a[i][0]+" "+a[i][2]);
        }
    }
}