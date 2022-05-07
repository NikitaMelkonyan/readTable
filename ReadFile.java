import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String args[]) throws IOException {

        File file = new File("D:\\TestData.xls");
        FileInputStream inputStream = new FileInputStream(file);

        HSSFWorkbook wb = new HSSFWorkbook(inputStream);

        HSSFSheet sheet = wb.getSheet("STUDENT_DATA");

        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

        for (int i = 0; i <= rowCount; i++) {

            int cellcount = sheet.getRow(i).getLastCellNum();

            System.out.println("Row " + i + " data is:");

            for (int j = 0; j < cellcount; j++) {
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + ", ");
            }
            System.out.println();
        }
    }
}
