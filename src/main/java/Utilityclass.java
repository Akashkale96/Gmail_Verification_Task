import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Utilityclass
{

    public static String getTD(int rowindex,int colindex) throws IOException
    {
        FileInputStream file = new FileInputStream("src/test/java/resources/excelsheet.xlsx");
        Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
        String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
        return value;
    }

}
