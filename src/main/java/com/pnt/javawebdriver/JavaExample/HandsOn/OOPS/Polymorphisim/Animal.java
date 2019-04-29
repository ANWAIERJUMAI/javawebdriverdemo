package com.pnt.javawebdriver.JavaExample.HandsOn.OOPS.Polymorphisim;

 class Animal {
     public void animalsound() {
         System.out.println("the animal make a sound");

     }
 }

    class Cat extends Animal {
        public void animalsound() {
            System.out.println("mmiao mmiao");
        }

    }

    class sheep extends Animal {
        public void animalsound() {
            System.out.println("meee, meee");
        }
    }

    class myAnimalclass{
        public static void main(String[] args) {
            Animal MyAnimal=new Animal();
            Animal Maycat=new Cat();
            Animal Mysheep=new sheep();
            MyAnimal.animalsound();
            Maycat.animalsound();
            Mysheep.animalsound();



    }
}
