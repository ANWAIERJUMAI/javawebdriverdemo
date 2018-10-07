package com.pnt.javawebdriver.JavaExample.ApiFramework;

public class ApiResponseWrapper {
    private long responseTime;
        private int responseCode;
        private String responseString;

               public ApiResponseWrapper() {
               }

               public ApiResponseWrapper(long responseTime, int responseCode, String responseString) {
                   this.responseTime = responseTime;
                   this.responseCode = responseCode;
                   this.responseString = responseString;
               }

               public long getResponseTime() {
                   return responseTime;
               }

               public void setResponseTime(long responseTime) {
                   this.responseTime = responseTime;
               }

               public int getResponseCode() {
                   return responseCode;
               }

               public void setResponseCode(int responseCode) {
                   this.responseCode = responseCode;
               }

               public String getResponseString() {
                   return responseString;
               }

               public void setResponseString(String responseString) {
                   this.responseString = responseString;
              }

}
