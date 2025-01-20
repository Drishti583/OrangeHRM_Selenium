package HRM;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class CredentialsUtil {

    private static String username;
    private static String password;

    // Load credentials from an Excel file
    public static void loadCredentialsFromExcel(String excelFilePath) throws IOException {
        // Open the Excel file
        FileInputStream fis = new FileInputStream(excelFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        
        // Get the first sheet
        XSSFSheet sheet = workbook.getSheetAt(0);

        // Read the username and password from the first row (assuming the second row has the data)
        username = sheet.getRow(1).getCell(0).getStringCellValue();
        password = sheet.getRow(1).getCell(1).getStringCellValue();

        // Close the workbook and input stream
        workbook.close();
        fis.close();
    }

    // Get the username
    public static String getUsername() {
        return username;
    }

    // Get the password
    public static String getPassword() {
        return password;
    }
}

/*public class CredentialsUtil {

	private static String username;
    private static String password;

    public static void setCredentials(String username, String password) {
        CredentialsUtil.username = username;
        CredentialsUtil.password = password;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
}
*/