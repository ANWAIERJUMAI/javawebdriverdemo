package com.pnt.javawebdriver.JavaExample.Oops.InAb.InAb;

 class country {
     public void NorthAmerica(){
         System.out.println("North America is Content");
     }
}
class America extends country{
     public void NorthAmerica(){
         System.out.println("America is in NorthAmerica");
     }
}
class India extends country{
     public void NorthAmerica(){
         System.out.println("India is not in NorthAmerica");
     }
}
class World{
    public static void main(String[] args) {
        country Mycountry=new country();
        country MyIndia=new India();
        country MyUSA=new America();
        Mycountry.NorthAmerica();
        MyIndia.NorthAmerica();
        MyUSA.NorthAmerica();
    }
}