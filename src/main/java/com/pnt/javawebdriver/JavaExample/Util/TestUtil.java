package com.pnt.javawebdriver.JavaExample.Util;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class TestUtil {
    static Workbook book;
    static Sheet sheet;
    public static String TESTDATA_SHEET_PATH="C:/Users/enlem/IdeaProjects/"+
            "src/main/java/com/pnt/javawebdriver/JavaExample/TestData/LoginTestData.xlsx";
    public static Object[][] getTestData(String Login) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(TESTDATA_SHEET_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //try {
          //      book = WorkbookFactory.create(file);
            //   } catch (InvalidFormatException e){
              //   e.printStackTrace();
            //}catch (IOException e){
              //e.printStackTrace();
            //}
            sheet = book.getSheet(Login);
            Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
          //  System.out.println(sheet.getLastRowNum() + "---------"+
            //sheet.getRow(0).getLastCellName());

            for (int i = 0; i < sheet.getLastRowNum(); i++) {
                for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                    data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
                   // System.out.println(data[i][k]);
                }
            }
            return data;
        }
    }

