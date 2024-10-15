package helper;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.DataBaseReader;



public class DataBaseHelper {
	WebDriver driver;
	public DataBaseHelper(WebDriver driver) {
		this.driver=driver;
	}
	DataBaseReader dataBaseReader = new DataBaseReader();
	WaitHelper waitHelper = new WaitHelper(driver);
	public void clickScreenUsingQuery(String optName,String appName) throws ClassNotFoundException, SQLException {
		List<String> listOfOptIDFromRET = dataBaseReader.getListOfOptIDFromRET(optName,appName);
		for (int i = listOfOptIDFromRET.size()-1; i >= 0; i--) {
			System.out.println(listOfOptIDFromRET.get(i));
			String xpath = "//div[@id='"+listOfOptIDFromRET.get(i)+"']";
			for (int j = 0; j <200; j++) {
				try {
					driver.findElement(By.xpath(xpath)).click();
					break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
				
			}
			
			
		}

	}

}
