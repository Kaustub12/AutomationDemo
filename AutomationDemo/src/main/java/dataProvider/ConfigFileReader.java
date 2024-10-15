package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = "configs//data.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}

	public String getFMSApplicationUrl() {
		String url = properties.getProperty("FMSapplicationUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getPCSApplicationUrl() {
		String url = properties.getProperty("PCSapplicationUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getSADSApplicationUrl() {
		String url = properties.getProperty("SADSapplicationUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getFMSparamsUrl() {
		String url = properties.getProperty("FMSparamsUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getPCSparamsUrl() {
		String url = properties.getProperty("PCSparamsUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getCSMParamApplicationUrl() {
		String url = properties.getProperty("CSMparamsUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getCSMApplicationUrl() {
		String url = properties.getProperty("CSMapplicationUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getBrowser() {
		String browser = properties.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the Configuration.properties file.");
	}

	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}

	public long getTimeOut() {
		String timeOut = properties.getProperty("timeout");
		long parseLong = Long.parseLong(timeOut);
		if (parseLong != 0)
			return parseLong;
		else
			throw new RuntimeException("timeOut not specified in the Configuration.properties file.");
	}

	public long getPollingTime() {
		String pollingTime = properties.getProperty("pollingTime");
		long parseLong = Long.parseLong(pollingTime);
		if (parseLong != 0)
			return parseLong;
		else
			throw new RuntimeException("pollingTime not specified in the Configuration.properties file.");
	}

	public String getFMSApplicationUserType() {
		String userType = properties.getProperty("FMS_Application_UserType");
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}

	public String getPCSApplicationUserType() {
		String userType = properties.getProperty("PCS_Application_UserType");
		System.out.println("userType "+userType);
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}

	public String getFMSApplicationUserTypeSendAlert() {
		String userType = properties.getProperty("FMS_Application_UserTypeSendAlert");
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}

	public String getFMSParamApplicationUserType() {
		String userType = properties.getProperty("FMS_ParamApplication_UserType");
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}

	public String getPCSParamApplicationUserType() {
		String userType = properties.getProperty("PCS_ParamApplication_UserType");
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}

	public String getCSMApplicationUserType() {
		String userType = properties.getProperty("CSM_Application_UserType");
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}

	public String getCSMParamApplicationUserType() {
		String userType = properties.getProperty("CSM_ParamApplication_UserType");
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}

	public String getSADSApplicationUserType() {
		String userType = properties.getProperty("SADS_Application");
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}

	public String getIISParamApplicationUrl() {
		String url = properties.getProperty("IISParamsapplicationUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getIISApplicationUrl() {
		String url = properties.getProperty("IISapplicationUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getIISApplicationUserType() {
		String userType = properties.getProperty("IIS_Application_UserType");
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}

	public String getIISParamApplicationUserType() {
		String userType = properties.getProperty("IIS_ParamApplication_UserType");
		System.out.println(userType);
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}
	
	//*****************************************************IIS Cloud Setup Starts**********************************************************//
	
	public String getIISParamApplicationUrlCloud() {
		String url = properties.getProperty("IISParamsapplicationUrlCloud");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getIISApplicationUrlCloud() {
		String url = properties.getProperty("IISapplicationUrlCloud");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public String getIISApplicationUserTypeCloud() {
		String userType = properties.getProperty("IIS_Application_UserType_Cloud");
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}

	public String getIISParamApplicationUserTypeCloud() {
		String userType = properties.getProperty("IIS_ParamApplication_UserType_Cloud");
		System.out.println(userType);
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}
	
	//*************************************************IIS Cloud Setup End **********************************************************//
	
	
	//*************************************************FMS Cloud Setup Starts **********************************************************//
	public String getFMSApplicationCloudUrl() {
		String url = properties.getProperty("FMSapplicationCloudUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public String getFMSparamsCloudUrl() {
		String url = properties.getProperty("FMSparamsCloudUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public String getFMSApplicationUserTypeCloud() {
		String userType = properties.getProperty("FMS_Application_UserType_Cloud");
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}
	
	public String getFMSParamApplicationUserTypeCloud() {
		String userType = properties.getProperty("FMS_ParamApplication_UserType_Cloud");
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}
	
	
	
	//*************************************************IIS Cloud Setup End **********************************************************//

	
	
	
	
	
	
	//*************************************************ITRS Cloud Setup End **********************************************************//
	public String getITRSApplicationUrlCloud() {
		String url = properties.getProperty("ITRSapplicationUrlCloud");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public String getITRSApplicationUserTypeCloud() {
		String userType = properties.getProperty("ITRS_Application_UserType_Cloud");
		if (userType != null)
			return userType;
		else
			throw new RuntimeException("User Type is not specified in the Configuration.properties file.");
	}
	
	//*************************************************ITRS Cloud Setup End **********************************************************//
}
