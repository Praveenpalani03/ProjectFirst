package startLevelSam;

import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.table.AbstractTableModel;

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

public class WebSam {
	public static void main(String[] args) throws Exception{
	    System.setProperty("webdriver.edge.driver","C:\\Users\\prasanth\\eclipse-workspace\\startLevelSam\\target\\driver\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Redmi Mobiles",Keys.ENTER);
		List<WebElement> productname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> productprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		
		String product_name;
		String product_price;
        int i_product_price;
        
        Map<String,Integer> fmp = new LinkedHashMap<String,Integer>();
        
		for(int i=0;i<productname.size();i++) {  
			product_name = productname.get(i).getText();
			product_price = productprice.get(i).getText();
		    product_price = product_price.replaceAll("[^0-9]", "");
			i_product_price = Integer.parseInt(product_price);	
			fmp.put(product_name, i_product_price);
			System.out.println(fmp);
		
	}
			
		
		
	}}
	

