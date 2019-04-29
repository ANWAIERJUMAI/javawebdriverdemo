package com.pnt.javawebdriver.JavaExample.HandsOn;

public class DecesionMaker {
    public static void main(String[] args) {
        int a;
        int b;
        for(a=1;a<=9;a++){
            for(b=1;b<a;b++){
                System.out.print("*");
            }
            System.out.println("  ");
        }
        for(b=1;b<20;b++)
        if(b%2==0) {
            System.out.println("even number is " + b);
        }
else {
            System.out.println("odd number"+b);
        }
        int day=4;
            switch (day){
                case 1:
                    System.out.println("Appak");
                    break;
                case 2:
                    System.out.println("Oghlem");
                    break;
                case 3:
                    System.out.println("MOON");
                    break;
                case 4:
                    System.out.println("Sun");
                    break;
                 default:
                     System.out.println("what are you talking about");
                }
        int e=20;
            while( e<25){
            System.out.println(e);
            e++;
        }
        int f=13;

           do {
               System.out.println("f value is   " + f);
               f++;}
               while (f < 34) ;


    }
}
