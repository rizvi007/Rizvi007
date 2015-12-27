import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MenPage
{
	FirefoxDriver dr;
	MenPage(FirefoxDriver sd)
	{
		dr=sd;
	}
	public DesignerSweater clickDesignerSweaterslink()
	{
		dr.findElement(By.xpath(".//*[@id='departmentLeftNaviContainer']/div[3]/ul/li[12]/a")).click();
		return new DesignerSweater(dr);
	}

}
