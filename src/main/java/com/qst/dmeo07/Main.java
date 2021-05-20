package com.qst.dmeo07;

import java.util.Scanner;
//环由n个点组成，n个点按顺时针顺序标号1到n
//模拟一个物体在环上的运动
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();//环的点数
        int y = scanner.nextInt();//初始位置
        int m = scanner.nextInt();//操作次数
        int[][] a = new int[x][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            switch (a[i][0]) {
                case 0:
                    y = move(y, -a[i][1], x);
                    break;
                case 1:
                    y = move(y, a[i][1], x);
                    break;
                default:
                    break;
            }
        }
        System.out.println(y);
    }
    public static int move(int start, int distance, int length) {
        if (start + distance > length) {
            return start + distance - length;
        } else if (start + distance <= 0) {
            return start + distance + length;
        }
        return start + distance;
    }
}
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int a,b,i;
//        int n=scanner.nextInt();//环数
//        int s=scanner.nextInt();//起始位置
//        int m=scanner.nextInt();;//操作数
//        for(i=0;i<m;i++){
//            a=scanner.nextInt();
//            b=scanner.nextInt();
//
//            if(a==1){
//                s+=b;
//                if(s>n){
//                    s=s-n;
//                }
//            }else
//            if(a==0){
//                s=s-b;
//                if(s<=0){//没有0点
//                    s=n+s;
//                    //s=0-s+1;
//                }
//            }
//        }
//        System.out.println(s);
//    }
//}