import org.openqa.selenium.firefox.FirefoxDriver;


public class DesignerSweater 
{
	FirefoxDriver dr;
	DesignerSweater(FirefoxDriver fd)
	{
		dr=fd;
	}
	public void varifyTitle()
	{
		System.out.println(dr.getTitle());
	}
	

}
