package com.qst02.Demo03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
         String s="";
        for (int i = x; i >=0; i--) {
            int a=scanner.nextInt();
                if (i==0&&a>0&&s.length()!=0)
                {
                    s=s+"+"+a;
                    continue;
                }else if (i==0&&a>0&&s.length()==0)
                {
                    s=s+a;
                    continue;
                }
                if (i==0&&a<0)
                {
                    s=s+a;
                    continue;
                }
                if (i==1&&a>0&&s.length()!=0)
                {
                    if (a!=1&&(-a)!=1) {
                        s=s+"+"+a+"x";
                    }else {
                        s=s+"+x";
                    }
                    continue;
                }else if (i==1&&a>0&&s.length()==0)
                {
                    if (a!=1&&(-a)!=1) {
                        s=s+a+"x";
                    }else {
                        s=s+"x";
                    }
                    continue;
                }
            if (i==1&&a<0)
            {
                if (a!=1&&(-a)!=1) {
                    s=s+a+"x";
                }else {
                    s=s+"-x";
                }
                continue;
            }
            if (a!=1&&(-a)!=1&&a!=0)
            {
                if (a>0&&x!=i&&s.length()!=0)
                {
                    s=s+"+"+a+"x^"+i;
                    continue;
                }
                if (s.length()==0)
                {
                    s=s+a+"x^"+i;
                    continue;
                }
                if (a<0)
                {
                    s=s+a+"x^"+i;
                    continue;
                }
            }
            else {
                if (a>0&&x!=i&&s.length()!=0)
                {
                    s=s+"+x^"+i;
                    continue;
                }
                if (a>0&&s.length()==0)
                {
                    s=s+"x^"+i;
                    continue;
                }
                if (a<0)
                {
                    s=s+"-x^"+i;
                    continue;
                }
            }
        }
        if (s.length()==0)
        {
            s=s+0;
        }
        System.out.println(s);
    }
}
