import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlueflyHome {

	public static void main(String[] args)
	{
		
		WebDriver dr;
		System.setProperty("webdriver.gecko.driver", "/Users/MdEmadulHaque/Downloads/geckodriver");
		dr=new FirefoxDriver();
		dr.get("https://www.eshopper24.com/");
		
		List<WebElement> menue=dr.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li/a"));
		
		for(int i=0;i<menue.size();i++)
		{
			WebElement size=menue.get(i);
			
			
			String name=size.getAttribute("name");
			
			System.out.println(name);
		}
		


		


	}

}
