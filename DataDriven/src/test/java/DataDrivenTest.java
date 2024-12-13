import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataDrivenTest {

    public static void main(String[] args) throws IOException {
        ArrayList<String> data = xcellData();
         for(int i=1;i< data.size();i++)
        System.out.println(data.get(i));


    }

    public static ArrayList<String> xcellData() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\Downloads\\Book 1 (4).xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        ArrayList<String> a = new ArrayList<String>();
        System.out.println(workbook);

        int sheetCount = workbook.getNumberOfSheets(); //total no of sheets
        for (int i = 0; i < sheetCount; i++)
        {
            if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
                XSSFSheet desiredSheet = workbook.getSheetAt(i); //desiredsheet
                Iterator<Row> rows = desiredSheet.iterator(); //iterator starts at firstrow
                Row firstRow = rows.next(); //Rows vertically - first row
                Iterator<Cell> ce = firstRow.cellIterator(); //iterating first row all cells(00,01,02..)
                int cellplace = 0;
                int column = 0;
                while (ce.hasNext()) {
                    Cell singlecell = ce.next();

                    if (singlecell.getStringCellValue().equalsIgnoreCase("Data2")) {
                        column = cellplace;
//                        System.out.println(singlecell.getStringCellValue());
                    }
                    cellplace++;

                }
                System.out.println(column);
//                ..........

int k=0;
int co=0;
                while (rows.hasNext())
                {
                    Row row = rows.next();

                    if (row.getCell(column).getStringCellValue().equalsIgnoreCase("purchase")) {

                        Iterator<Cell> cell = row.cellIterator();


                        while (cell.hasNext())
                        {
                            co=k;
                           Cell c= cell.next();
//                           if(c.getStringCellValue().equalsIgnoreCase(""))
//                            System.out.println( row.getCell(column));
                           if( c.getCellType()== CellType.STRING)
                           {
                            a.add(c.getStringCellValue());
                        }
                           else{
                               a.add( NumberToTextConverter.toText(c.getNumericCellValue()));

                           }
                           }k++;

                    }


                }System.out.println(k);



            }

        }
//        System.out.println(a.get(0));
        return a;

    }
}


