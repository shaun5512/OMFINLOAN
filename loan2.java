package loancal;

import java.lang.module.FindException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class loan2 {

    public static webdriver driver = null;
    
	public static void main(String[] args) throws FindException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Pesloan\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage()

	}

}
