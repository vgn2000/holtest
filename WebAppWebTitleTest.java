
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;




public class WebAppWebTitleTest {
	WebDriver driver;
	
	@Before
	public void testSetup() {
		driver = new FirefoxDriver();
		//go to WebPage
		
		driver.navigate().to("http://www.thetestroom.com/webapp/contact.html");
		
		
		
	}
	
	
	@After
	public void testShutDown() {
				
	  //close the driver
       driver.close();
		
		}
	
	@Test
	public void shouldHavePageTitleABoutZoo() {
			

	//Clicking on the staffs from the WebSites
	
  	driver.findElement(By.id("about_link")).click();
	
	Assert.assertTrue(driver.getTitle().equals("About Zoo"));
	
	}
	
  	@Test
	public void shouldHavePageTitleContact() {
			
	//go to WebPage
	
	driver.navigate().to("http://www.thetestroom.com/webapp/contact.html");
	
	
	//Clicking on the staffs from the WebSites
	
  	driver.findElement(By.id("contact_link")).click();
	
  	Assert.assertTrue(driver.getTitle().equals("Contact"));
  	
	}
	
}
