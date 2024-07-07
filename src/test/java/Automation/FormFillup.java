package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFillup {
	public static void main (String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fname")).sendKeys("Jannatul Ferdous");
		driver.findElement(By.id("lname")).sendKeys("Maliha");
		
		WebElement radioButton =  driver.findElement(By.id("female"));
		radioButton.click();
		radioButton.isSelected();
		
		WebElement testDropDown = driver.findElement(By.id("option"));
		Select dropdown = new Select(testDropDown);
		dropdown.selectByValue("option 2");
	
		
		WebElement multipleOption = driver.findElement(By.id("owc"));
		Select option = new Select(multipleOption);
		option.selectByValue("option 2");
		option.selectByValue("option 3");
		
		WebElement applicableOption = driver.findElement(By.id("moption"));
		applicableOption.click();
		
		driver.findElement(By.id("myfile")).sendKeys("C:\\\\Users\\\\GIGABYTE\\\\OneDrive\\\\Desktop\\\\ppt\\\\fig.png");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();

	}

}
