package TestCase;

import UTILITIES.ExcelUtils;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class ExcelDemo {
    @Test
    public void readmyfile(){
         //create an object from ExcelUtils
        // it accepts 2 arguments
       //argument 1 location of file
      //argument 2 sheet name

      ExcelUtils file=new ExcelUtils("src/test/resources/Tariffario_NSTAR_2022_Umbria2.xlsx","Tariffario_NSTAR_2022_Umbria");
        //how many rows in sheet
        //System.out.println("file.rowCount() = " + file.rowCount());
        //how many columns in sheet
        //System.out.println("file.columnCount() = " + file.columnCount());
        //get column names
        //System.out.println("file.getColumnsNames() = " + file.getColumnsNames());
        //
        List<Map<String,String>> dataList= file.getDataList();
        for (Map<String, String> oneRow : dataList) {
             System.out.println(oneRow);
        }




    }






}




