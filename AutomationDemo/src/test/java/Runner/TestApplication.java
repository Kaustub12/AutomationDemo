package Runner;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = {"src/test/java/features_IIS","src/test/java/features","src/test/java/feature_PCS"},
		//features = {"src/test/java/features_IIS/IISSettlement.feature"},
		
		//features = {"src/test/java/features/FacilitiesManagement_482.feature"},
                glue = "stepdefinitions",
               // dryRun = true,
                //monochrome=false, //to make steps in color
                plugin = { "pretty",
                           "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                           "rerun:ReRunScenarios/FailedReRun.txt"}
               //dryRun = false //to check compilation errors                                      
               , tags= "@AT_PFD_010"            		   

)
public class TestApplication extends AbstractTestNGCucumberTests {
	/*.
	 * @Override
	 *
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
	
	
	
	@Before
	public void beforeExecution() {
		System.out.println("*** Test Execution started ***");

	}
	

	@After
	public void afterExecution() {
		System.out.println("*** Test Execution Finished ***");
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

}