package startLevelSam;
import java.io.File;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.table.AbstractTableModel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.page.Page.GetAppIdResponse;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;


public class SamMap {
	 public static void main(String[] args) throws Exception {
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\prasanth\\eclipse-workspace\\startLevelSam\\target\\driver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
//	        String URL ="https://www.flipkart.com/";
	 
			driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIs6zHicv1hAMVFKpmAh06yQDHEAAYASAAEgLqfPD_BwE&gclsrc=aw.ds");
			driver.manage().window().maximize();
			driver.findElement(By.xpath(""))
			Runtime.getRuntime().exec("\"C:\\Users\\prasanth\\Downloads\\file up.exe\"");
			
		}

	}
//	     