package com.pnt.javawebdriver.JavaExample.HandsOn;

import java.util.Scanner;//Import the scanner class

public class UserInput {
    public static void main(String[] args) {
        Scanner MyObj=new Scanner(System.in);//create a scanner object
        System.out.println("Enter user name, age and salary:");
        String username;//read user input
        username = MyObj.nextLine();

        //int userage=MyObj.nextInt();

       // double salary=MyObj.nextDouble();
        System.out.println("User name is:"+ username);//output user input
       // System.out.println("User age is :"+ userage);
        //System.out.println("User salary is:"+ salary);
    }
}
