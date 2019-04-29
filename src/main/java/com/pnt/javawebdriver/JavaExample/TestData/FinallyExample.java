package com.pnt.javawebdriver.JavaExample.TestData;

class FinallyExample {
        public static void main(String args[]){
            try {
                int x=100;
            }
            catch(Exception e) {
                System.out.println(e);
            }
            finally {
                System.out.println("finally block is executing");}
        }}
