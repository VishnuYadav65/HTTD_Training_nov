package org.example;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel {
    public static Object[][] getData() throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\DDF\\src\\main\\resources\\Book 1 (8).xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheetAt(0);
        int RowCount = sheet.getPhysicalNumberOfRows();
        XSSFRow row = sheet.getRow(0); //---------------
        int ColCount =row.getLastCellNum();
        Object[][] Data =new Object[RowCount-1][ColCount];

        for(int i=0;i<RowCount-1;i++){
            row= sheet.getRow(i+1);
            for(int j=0;j<ColCount;j++)
            {
                XSSFCell cellvalue = row.getCell(j);
                DataFormatter format=new DataFormatter();
                Data[i][j]=format.formatCellValue(cellvalue);
//                         Data[i][j]=cellvalue;

            }
        }
        return Data;

    }
}
