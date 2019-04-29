package com.pnt.javawebdriver.JavaExample.HandsOn;

public class Array {
    public static void main(String[] args) {
        int array[]={2,11,45,9};
        for(int a=0;a<array.length;a++){
            System.out.println(array[a]);

        }
        int Array[]={8,9,0,2};
        for(int b=0;b<array.length;b++){
            System.out.println(Array[b]);
        }
        String Ar[]={"red","black","yellow","blue","green"};
        for (int a=0;a<Ar.length;a++){
            System.out.println(Ar[a]);
        }
        int Arr[]=new int[] {1,2,3,4,5,6};
        for(int d=0;d<Arr.length;d++) {
            if(d%2==0) {
                System.out.println("even  "  + d);
            }
            else{
                System.out.println("odd  " +d);
            }
            String[] Colur=new String[5];
            Colur[0]="Oghlem";
            Colur[1]="Enver";
            Colur[2]="Love";
            Colur[3]="USA";
            Colur[4]="Sun";
           // Colur[5]="moon";
            for(int f=0;f<Colur.length;f++)
                System.out.println(Colur[f]);
        }
        int[] Num=new int[3];
        Num[0]=100;
        Num[1]=200;
        Num[2]=301;
        for(int e=0;e<Num.length;e++){
            System.out.println(Num[e]);
            {
            if(e%2==0){
                System.out.println("Number devisible by 2 is  "+e);}
            }
        }

    }

}



