package com.pnt.javawebdriver.JavaExample.HandsOn;

public class OneToHandrued {
    public static void main(String[] args) {
        for(int a=1;a<100;a++){
            System.out.println("  "+a);

    }
    for(int b=1;b<100;b++){
        if(b%7==0)
            System.out.print("  "+b);
    }


    for(int c=1;c<100;c++){
        for(int d=1;d<100;d++){
            int f=c*d;
            if(c%2==0){
                if(d%2==0)
                    System.out.print(String.format ("%d*%d=%d",c,d,f));
            }
            System.out.print("  ");

        }
    }
    }
}
