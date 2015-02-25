import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigationLinksTest {

	
WebDriver driver;
	
	@Before
	public void TestSetup() {
	driver = new FirefoxDriver();
	//Para abrir a pagina (para ir ate a página)
	driver.navigate().to("http://www.thetestroom.com/webapp/");
	
	}
	
	@After
	public void TestShutDown() {
		//close the browser
	      driver.close();
	}
	
	
	@Test
	public void ShouldNavigatorUsingLocators() {
		//clicar nos localizadores da pagina
		
		driver.findElement(By.id("Contact_link")).click();
		Assert.assertTrue(
		driver.findElement(By.id("subhead")).getText().equals("Contact Form"));
		
		
	}					
	
	
	
}
