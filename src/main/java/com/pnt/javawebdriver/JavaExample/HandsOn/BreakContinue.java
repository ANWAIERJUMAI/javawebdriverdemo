package com.pnt.javawebdriver.JavaExample.HandsOn;

public class BreakContinue {
    public static void main(String[] args) {
        int i=1;
        while(i<10){
            System.out.println(i);
            i++;
            if(i==4){
                break;
            }
        }
        int f=0;
        while(f<10){
            if(f==4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;

            break;
        }
    }
}
