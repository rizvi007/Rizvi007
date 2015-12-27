import org.junit.Test;


public class SmokeTest extends Support
{
	HomePage homepage;
	WomanPage womanpage;
	MenPage manpage;
	DesignerSweater designersweater;
	@Test
	public void test01()
	{
		homepage=new HomePage(dr);
		homepage.varifyTitle();
		womanpage=homepage.clickWomanpage();
		womanpage.varifyWomanPageTitle();
	}	
	@Test
	public void test02()
	{
		homepage=new HomePage(dr);
		manpage=homepage.clickMenPage();
		designersweater=manpage.clickDesignerSweaterslink();
		designersweater.varifyTitle();
		
	}
	

		
	
	
	

}
