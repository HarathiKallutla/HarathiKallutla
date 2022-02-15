package harathi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stubC:\\Users\\kallutla.harathi\\Downloads\\chromedriver_win32 (3).zip\\chromedriver.exe
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kallutla.harathi\\Downloads\\chromedriver_win32 (3).zip\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("file:///C:/Users/kallutla.harathi/AppData/Local/Temp/Temp1_HTML%20TUTORIAL-20220208T171136Z-001.zip/HTML%20TUTORIAL/practicehtml.html");
	        WebElement theDropDown=driver.findElement(By.xpath("//select[@id='cars']"));
	        Select select = new Select(theDropDown);
	        select.selectByIndex(3);

	}

}
