package com.pnt.javawebdriver.JavaExample.TestNGFrameWork;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestNGDemo {
    @BeforeClass
    public void setUp(){
        System.out.println("This code runs once the test class is instantiated"); }
    @Test
    public void LoginTest(){
        DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/ddd HH:mm:ss:SSS");
        Date date =new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("This is Test A");

    }
}
