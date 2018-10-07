package com.pnt.javawebdriver.JavaExample.JUnitFrameWork;

import org.junit.rules.TestName;
import org.testng.annotations.BeforeClass;
import org.junit.*;

public class JUnitDemo {
@BeforeClass
    public static void RunOnceBeforeTheStartOfAllTests(){
    System.out.println("JUnit BeforeClass runs only once before all methods"); }
    @Before
    public void runBeforeEachTest(){
        System.out.println("JUnit Before run once before each Test"); }
  @Rule
  public TestName name=new TestName();
 @Test
 public void powerTest(){
     System.out.println("Test name: " + name.getMethodName());
     System.out.println("This is a power test");
     Assert.assertTrue(Math.pow(10,2)==100);
 }
 @After
    public void runAfterEachTest(){
     System.out.println("Junit After runs once after each test");
 }
 @AfterClass
    public static void runOnceAfterTheEndOfAllTest(){
     System.out.println("Junit After Class runs only all tests have been finished");
 }

}
