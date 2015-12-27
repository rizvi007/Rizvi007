import org.openqa.selenium.firefox.FirefoxDriver;


public class WomanPage 
{
	FirefoxDriver dr;
	WomanPage(FirefoxDriver fd)
	{
		dr=fd;
	}
	public void varifyWomanPageTitle()
	{
		System.out.println(dr.getTitle().contains("Womens Designer Clothing | BLUEFLY Up to 70% Off Designer Brands"));
	}
	

}
