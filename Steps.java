package StepDefinition;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
import java.io.FileInputStream;
import java.io.IOException;
 Excel Imports
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
*/
//import cucumber.api.junit.Cucumber;

public class Steps {
	WebDriver driver; 
	
	@Given("^I am on Facebook login page$") 
	@SuppressWarnings("deprecation")
	public void I_am_on_Facebook_login_page() { 
		   System.setProperty("webdriver.chrome.driver", "C:\\Sejars\\chromedriver_win32 (2)\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("https://www.facebook.com"); 
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	   } 
	  
	@Given("^Open the Chrome and launch the application$")				
    public void open_the_Chrome_and_launch_the_application() throws Throwable{
		
        System.out.println("This Step open the Chrome and launch the application.");					
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       System.out.println("This step enter the Username and Password on the login page.");					
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        System.out.println("This step click on the Reset button.");					
    }	
    @Then("^Close the Browser$")
	public void Close_the_Browser(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.close();
	}
    @Given("^This is a blank test$")				
    public void This_is_a_blank_test() throws Throwable{
		
        System.out.println("This is from Scenario#2 i.e. Add a product to bag");					
    }	
    
    @When("^a user enters \"(.*)\" and \"(.*)\"$")
    public void when_user_enters_filename(String filename, String sheetname) throws Throwable{
    	System.out.println("This is from RegressionTest: " + filename + " " + sheetname);
    	String[][] data = null;
    	FileInputStream fis = new FileInputStream(filename);
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
  	   	XSSFSheet sh = wb.getSheet(sheetname);
  	   	XSSFRow row = sh.getRow(0);
  	   	int noOfRows = sh.getPhysicalNumberOfRows();
  	   	int noOfCols = row.getLastCellNum();
  	   	System.out.println("No of rows data = "+ noOfRows + " No of cols data = " + noOfCols);
  	   	Cell cell;
  	   	data = new String[noOfRows-1][noOfCols];
  	  for(int i =1; i<noOfRows;i++){
		     for(int j=0;j<noOfCols;j++){
		    	   row = sh.getRow(i);
		    	   cell= row.getCell(j);
		    	   data[i-1][j] = cell.getStringCellValue();
		    	   System.out.println("row and col = " + i +" , " + j);
		    	   System.out.println("This is reading excel data" + cell.getStringCellValue());
	   	 	   }
	   	}
    } 
    
    
    
}
