package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {

    String path = "SampleData.xlsx";
    //to read from excel, we need to load it to FileInputStream
    FileInputStream fileInputStream = new FileInputStream(path);

    //workbook>sheet>row>cell

    //1. create a workbook
    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

    //2. we need to get spec sheet from current excel
    XSSFSheet sheet = workbook.getSheet("Employees");

    //3 select row and cell
    //print out Mary's cell (row 2 cell 1)
    //indexes start from 0
    System.out.println(sheet.getRow(1).getCell(0));

    //print out developer
    System.out.println(sheet.getRow(3).getCell(2));

    //return the count of used cells only
    //starts countinmg from 1
    int usedRows = sheet.getPhysicalNumberOfRows();
    int lastUsedRow = sheet.getLastRowNum();

    System.out.println("usedRows = " + usedRows);
    System.out.println("lastUsedRow = " + lastUsedRow);

    //create a logic to print Vinod's name (row 2 cell 0) yani A 3
    System.out.println(sheet.getRow(2).getCell(0));

        for (int rowNum = 0; rowNum <= lastUsedRow; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")){
                System.out.println(sheet.getRow(rowNum).getCell(0).toString());
            }
        }
//create a logic to print Linda's job (row 4 cell 0) yani A5'ten iki sonraki cell
        for (int i = 0; i <= lastUsedRow; i++) {
            if (sheet.getRow(i).getCell(0).toString().equals("Linda")){
                System.out.println("Linda's job is " + sheet.getRow(i).getCell(2).toString());
            }
        }


        XSSFCell cell = sheet.getRow(0).createCell(5);
        cell.setCellValue("Messi");

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);

        outputStream.close();
        workbook.close();
        fileInputStream.close();




    }

}
