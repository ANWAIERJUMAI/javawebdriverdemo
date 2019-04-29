package com.pnt.javawebdriver.JavaExample.HandsOn;

import java.util.ArrayList;

public class ArraylistX {
    public static void main(String[] args) {
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Enver");
        alist.add("Oghlem");
        alist.add("Denver");
        System.out.println(alist);
        alist.add(0,"Sun");
        alist.add(1,"moon");
        alist.set(0,"Car");
        alist.remove("Enver");
        alist.remove(2);
        String a=alist.get(0);
        System.out.println(a);
        alist.clone();
        int pos=alist.indexOf("Car");
        System.out.println(pos);
        boolean En=alist.contains("Gym");
        System.out.println(En);

        for(String i:alist){

            System.out.println("  "+i);

        }

    }
}
