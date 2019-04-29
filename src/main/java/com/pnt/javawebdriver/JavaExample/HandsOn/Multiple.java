package com.pnt.javawebdriver.JavaExample.HandsOn;
import java.lang.String;

public class Multiple {
    public static void main(String[] args) {
        for (int a = 1; a <=9; a++)
        {
            for (int b=1;b<=a;b++ )
            {
                int multiple=a*b;
        System.out.print(String.format("%d*%d=%d " , a,b,multiple));

    }
        System.out.println("");

}}}
