package com.pnt.javawebdriver.JavaExample.ApiFramework;
    import org.json.simple.JSONObject;
    import org.junit.*;
    import org.junit.rules.TestName;
public class ApiJUnitTestFramework {
    @Rule
       public TestName name = new TestName();

               @Before
       public void printTestStartInfo() {
                   System.out.println(name.getMethodName()+ " started ....");
               }
       @Test
       public void testOpenWeatherApiForLondon_UK() {
                   JSONObject response= ApiCall.getWeatherDataByCityName("London","uk");
                   String cityName=(String)response.get("name");
                   long responseCode=(Long)response.get("cod");
                   System.out.println(response.toString());
                   System.out.println("City: "+cityName);
                   System.out.println("Response code: "+responseCode);
                   Assert.assertEquals(cityName,"London");
               }
       @Test
       public void testOpenWeatherApiForBaltimore_US() {
                   JSONObject response=ApiCall.getWeatherDataByCityName("Baltimore","us");
                   String cityName=(String)response.get("name");
                   long responseCode=(Long)response.get("cod");
                   System.out.println(response.toString());
                   System.out.println("City: "+cityName);
                   System.out.println("Response code: "+responseCode);
                   Assert.assertEquals(cityName,"Baltimore");
               }


               @After
       public void printTestEndInfo() {
                   System.out.println(name.getMethodName()+ " ended .....");
               }


}
