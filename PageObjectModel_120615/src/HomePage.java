import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HomePage
{
	FirefoxDriver dr;
	HomePage(FirefoxDriver fd)
	{
		dr=fd;
	}
	public void varifyTitle()
	{
		System.out.println(dr.getTitle());
	}
	public WomanPage clickWomanpage()
	{
		dr.findElement(By.xpath(".//div[@id='global-nav']/ul/li[1]/a")).click();
		return new WomanPage(dr);
	}
	
	public MenPage clickMenPage()
	{
		dr.findElement(By.xpath(".//*[@id='main-nav-men']/a")).click();
		return new MenPage(dr);
	}
	public void m()
	{
		System.out.println("hi");
	}
	
	
	
	
	
	
	
	
	
	
	


}
