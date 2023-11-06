package stepdefination_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class defination_class {
    WebDriver driver;
    @Given("^Open Mount Sinai application$")
    public void open_Mount_Sinai_application() throws Throwable {


	    System.setProperty("webDriver.chrome.driver", "\"C:\\chormeDriver\\chrome-win64\\chrome.exe\"");
		 ChromeOptions naz= new ChromeOptions();
		 naz.addArguments("--remote-allow-origins=*");
		 
		 driver= new ChromeDriver();
		 //driver.get("https://www.mountsinai.org\r\n");
		 driver.get("https://www.jetblue.com/");
	 				
		 driver.manage().window().maximize();

		 //Thread.sleep(2000);
		 
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 

	    
	}

	@Then("^Click on about us link$")
	public void click_on_about_us_link() throws Throwable {
		WebElement link = driver.findElement(By.cssSelector("body > header > div.blue-sky-bg > div > nav.main-nav.collapse > ul > li:nth-child(6) > a.hidden-xs.dropdown"));
		link.click();
	    
	}


	@Then("^Enter departure and return date$")
	public void enter_departure_and_return_date() throws Throwable {
	   
		
//((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		
		JavascriptExecutor date= (JavascriptExecutor)driver;
		date.executeScript("document.getElementById('jb-date-picker-input-id-2').value='09/15/2023'");
		date.executeScript("document.getElementById('jb-date-picker-input-id-3').value='09/20/2023'");
		Thread.sleep(3000);
		//driver.close();
		
		
		
		
		
		
		
		
		
	}



	}

	
	
	
	
	
	
	
	
	

