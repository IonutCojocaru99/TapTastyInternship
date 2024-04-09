
package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.fail;

//TC_001_CheckFavorite
//1. Home page is opened;
//2. User logged in;
//3. Go to the menu and select a product;
//4. Click on favorite button;
//5. Check if the product is save in favorites

public class TC_001_CheckFavorite extends BaseClass{

	@Test
	public void verify_cart()
	{
		logger.info("**** starting TC_001_CheckFavorite  *****");

		logger.debug("application logs started......");

		try {
			HomePage hp = new HomePage(driver);
			hp.lnkLogin();
			logger.info("Clicked on Login button");

			logger.info("Going to login page");
			LogInPage regpage = new LogInPage(driver);

			regpage.setEmail("mircea.dragomir93+5@gmail.com");
			regpage.password("testare");

			regpage.clickLogin();
			Thread.sleep(2000);
			regpage.clickmenu();
			logger.info("Click menu");
			regpage.aleggustari();
			logger.info("Click gustari");
			regpage.cartofi();
			logger.info("Click cartofi");
			regpage.favcartofi();
			logger.info("Cartofi favoriti salvati");
			if(driver.findElement(xpath("//div[@class='dialog-text']")).isDisplayed())
			{
				logger.info("Produs salvat la favorte");
				Object ObiectActual_message = driver.findElement(xpath("//div[@class='dialog-text']")).getText();
				String Expectet_message = "Produsul a fost adăugat la Favorite!";
				Assert.assertEquals(ObiectActual_message, Expectet_message);
			}

			if(driver.findElement(xpath("//div[@class='dialog-text']")).isDisplayed())
			{
				logger.info("Pop-up aparat");
				regpage.okselect();
			}
		}
		catch(Exception e)
		{
			logger.error("test failed..");
			logger.debug("debug logs....");
			Assert.fail();
		}

		logger.debug("application logs end.......");
		logger.info("**** finished TC_001_CheckFavorite *****");
	}
}
