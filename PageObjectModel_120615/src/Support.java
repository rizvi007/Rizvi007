import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Support 
{
	FirefoxDriver dr;
	@Before
	public void m() throws InterruptedException
	{
		dr=new FirefoxDriver();
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		Thread.sleep(3000);
		dr.navigate().refresh();
		
		
		
	}
	@After
	public void m1() throws InterruptedException
	{
		Thread.sleep(3000);
		dr.quit();
	}

}
