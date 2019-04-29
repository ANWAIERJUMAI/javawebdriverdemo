package com.pnt.javawebdriver.JavaExample.HandsOn;

public class MultiSeven {
    public static void main(String[] args) {
        for(int a=1; a<=7;a++){
            for(int b=1;b<a;b++){
                int Mul=a*b;
                System.out.print(String.format("%d*%d=%d ",a,b,Mul));
            }
            System.out.println(" ");
        }
    }
}
