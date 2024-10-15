package helper;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProvider.ConfigFileReader;

import resources.BaseClass;

public class BufferHelper {

	WebDriver driver = BaseClass.driver;
	
	Logger Log = LogManager.getLogger(BrowserHelper.class.getName());
	ConfigFileReader configFileReader = new ConfigFileReader();

	// wait helper constrcutor
	public BufferHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void waitForElementInvisiblityBuffer(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean visible = element.isDisplayed();

		if (visible == true) {
			wait.until(ExpectedConditions.invisibilityOf(element));

			System.out.println("Progress icon Disappeard");
		}

	}

	public void waitForElementPresent(WebDriver driver, WebElement element, String visibleText) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.textToBePresentInElement(element, visibleText));

		System.out.println("Progress icon Disappeard");

	}

}
