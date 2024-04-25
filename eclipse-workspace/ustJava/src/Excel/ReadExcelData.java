package Excel;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import com.google.common.collect.Table.Cell;

class ReadExcelData {

	@Test @Ignore
	public void test() throws FileNotFoundException {
		 try {
			 File n = new File ("C:\\\\Users\\\\Administrator\\\\eclipse-workspace\\\\ustJava\\\\Testdata.xlsx");
				System.out.println(n.exists());
		//Properties p = new Properties();
		 FileInputStream fis= new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\ustJava\\Testdata.xlsx");
	//p.load(fis);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet s= workbook.getSheet("Test");
			XSSFRow r =s.getRow(1);
			XSSFCell c= r.getCell(0);
			System.out.println(c);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		}

	 @Test
	 
	 public void readFromExcel() throws IOException{
		 
		 File n = new File ("C:\\\\Users\\\\Administrator\\\\eclipse-workspace\\\\ustJava\\\\Testdata.xlsx");
			System.out.println(n.exists());
	//Properties p = new Properties();
	 FileInputStream fis= new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\ustJava\\Testdata.xlsx");
//p.load(fis);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet s= workbook.getSheet("Test");
		for (int i =0; i<s.getPhysicalNumberOfRows(); i++) {
			
			XSSFRow r =s.getRow(i);
			
			for (int j=0 ; j<r.getPhysicalNumberOfCells();j++) {
				XSSFCell c= r.getCell(j);
				System.out.println(c);
				
			}
		}
		
		
		
		 
		 
		 
	 }
}
