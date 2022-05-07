import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CheckValeu {
    public static void main(String args[]) throws IOException {

        File file = new File("D:\\TestData.xls");

        FileInputStream inputStream = new FileInputStream(file);

        HSSFWorkbook wb = new HSSFWorkbook(inputStream);

        HSSFSheet sheet = wb.getSheet("STUDENT_DATA");

        HSSFRow row2 = sheet.getRow(2);

        HSSFCell cell = row2.getCell(0);

        String name = cell.getStringCellValue();

        System.out.println(name);

        if (name.equals("Nik")) {
            System.out.println("Your name is :" + name);
        } else {
            System.out.println("Your name is not Nik. Your name is " + name);
        }
    }
}

