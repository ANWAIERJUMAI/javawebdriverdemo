package com.pnt.javawebdriver.JavaExample.HandsOn;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Collection {
    public static void main(String[] args) {
        int[] array=new int[3];
        array[0]=5;
        array[1]=4;
        array[2]=9;
        for(int a=0;a<array.length;a++) {
            System.out.println(array[a]);
        }
        ArrayList<Integer> alist= new ArrayList<Integer>();
        alist.add(12);
        alist.add(86);
        alist.add(24);
        alist.add(33);
        alist.add(2,55);
        for(int f:alist) {
            System.out.println("alist is "+f);
            if( f%2==0){
                System.out.print("oven number is :"+  f);
            }
            else{
                System.out.print("odd number is:"+  f);
            }

        }

        //LinkedList
        LinkedList<Integer> link=new LinkedList<Integer>();
        link.add(23);
        link.addFirst(12);
        link.addLast(67);
        link.indexOf(67);
        for(int c:link){
            System.out.println("This is linkedlist:  "+c);
        }

        //Hmap

        HashMap<Integer,String> hmap=new HashMap<Integer, String>();
        hmap.put(0,"Enver");
        hmap.put(1,"Oghlen");
        hmap.size();
        System.out.println(hmap);


        // Hset
        HashSet<String> Hset=new HashSet<String>();
        Hset.add("zero");
        Hset.add("two");
        Hset.add("zero");
        for (String h:Hset) {
            System.out.println("Hset is= " + h);
        }
        //Praymit
        int a;
        int b;
        for(a=0;a<=5;a++){
            for(b=0;b<a;b++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        int e;
        for(e=0;e<=100;e++){
            if(e%2==0){
                System.out.println("oven number is : "+e);
            }
        }
    }
}
