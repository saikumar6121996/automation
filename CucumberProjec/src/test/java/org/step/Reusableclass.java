package org.step;


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;


	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Reusableclass {
		public static WebDriver driver;
	    public static Select a;
	    public static Actions actions;
	    public static TakesScreenshot ts;
	    public static Alert alert;
	    public static JavascriptExecutor js;
	    public static Robot robot;
	    
	    
	    
	 public  static void edgebrowserconfiguration() {
	    	
	   	 driver = new EdgeDriver();
	   }	    
	    
	public  static void browserconfiguration() {
		
		 driver = new ChromeDriver();
	}	
	public static void geturl(String url) {
		driver.get(url);

		}

	public static void maximise() {
		 driver.manage().window().maximize();

		}
		
	public static void waits(long time) {
			
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		}
		
	public static void dropdown(WebElement element, String visibletext) {
			a= new Select(element);
			a.selectByVisibleText(visibletext);

		}
		
	public static void doubleclick(WebElement element) {
			 actions = new Actions(driver);

		}
	public static void close() {
			driver.close();

		}
	public static void screenshot(String locator) throws IOException {
	    ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("locator");
		FileUtils.copyFile(source, destination);

	}
	 public static void alert() {
		driver.switchTo().alert();
		alert.accept();

	}
	 public static void dragA(WebElement source,WebElement destination) {
		actions =  new Actions(driver);
	  actions.dragAndDrop(source, destination).perform();
	}
	 
	 public static void windowhandle(String id) {
		driver.switchTo().window("String");
		
	}
	 public static void frames(WebElement element) {
		driver.switchTo().frame(element);

	}
	 public static void javascript() {
		 js= (JavascriptExecutor)driver;

	}
	 public static void robot() throws AWTException {
		 robot= new Robot();

	}
		
	 public static void fillTextBox(WebElement element, String text) {
		    element.sendKeys(text);
		}
		

	 public static void buttonclick(WebElement element ) {
		
		element.click();
	}
	 
	 public static void dateandTime() {
		Date d= new Date();
		System.out.println(d);

	}
	 
	 
	 
	 public static String excelData(String filePath, String sheetName, int rowNum, int cellNum) throws IOException {
		  
		        FileInputStream fis = new FileInputStream(new File(filePath));
		        Workbook book = new XSSFWorkbook(fis);
		        Sheet s = book.getSheet(sheetName);
		        Row r= s.getRow(rowNum);
		        Cell c = r.getCell(cellNum);
		        String value="";
		        
//		        if (c.getCellType()==1) {
//					value=c.getStringCellValue();
		        if (c.getCellType() == CellType.STRING) {
		            value = c.getStringCellValue();
				}
		        else if (DateUtil.isCellDateFormatted(c)) {
					Date dateCellValue = c.getDateCellValue();
					SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy");
					 value = sd.format(dateCellValue);
					//System.out.println(value);
				}
		        else {
					double num =c.getNumericCellValue();
					long l=(long)num;
					value= String.valueOf(l);
					//System.out.println(l);
				
				}
		        return value; 
		        

		        
		        
		   
		}

		
		
	}

	
	

