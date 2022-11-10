package com.syntax.reviewclass13;

import com.syntax.utils.ConfigReader;
import com.syntax.utils.ExcelReader;

import java.util.List;
import java.util.Map;

public class ExcelFileDemo2 {
    public static void main(String[] args) {
        List<Map<String,String>> excelData= ExcelReader.read("Files/SDETBatch13.xlsx");
        System.out.println(excelData);
        System.out.println(excelData.get(0).get("Country"));

    }
}
