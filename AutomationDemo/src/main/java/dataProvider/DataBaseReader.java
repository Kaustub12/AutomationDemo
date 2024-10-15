package dataProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseReader {
	DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration();

	public List<String> getListOfOptIDFromRET(String optName, String appName) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = databaseConfiguration.getDatabaseURL();
		String userName = databaseConfiguration.getDatabaseUserName();
		System.out.println(userName);
		String password = databaseConfiguration.getDatabasePassword();
		List<String> listOfOptName = new ArrayList<>();
		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement stmt = connection.createStatement();
		//String optName = databaseConfiguration.getOptName();
		String prgRef="";
		String idPrefix=databaseConfiguration.getOptNamePrefix();
		
		while (true) {
			
			String stringQuery="select prog_ref,app_name, parent_ref, prog_order, menu_title_eng, disp_order from opt where prog_ref = '"+optName+"' and app_name = '"+appName+"'";
			ResultSet executeQuery = stmt.executeQuery(stringQuery);
			while (executeQuery.next()) {
				optName = executeQuery.getString("PARENT_REF");
				prgRef = executeQuery.getString("PROG_REF");
				listOfOptName.add(idPrefix+prgRef);
			}
			if (optName.equals("ROOT"))
			{

				
				break;
			}
			
		}

	
	
		connection.close();
	return listOfOptName;

}

	public List<String> getListOfOptIDFromRETP() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = databaseConfiguration.getDatabaseURL();
		String userName = databaseConfiguration.getDatabaseUserName();
		String password = databaseConfiguration.getDatabasePassword();
		List<String> listOfOptName = new ArrayList<>();
		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement stmt = connection.createStatement();
		String optName = databaseConfiguration.getOptName();
		String prgRef="";
		String idPrefix=databaseConfiguration.getOptNamePrefix();
		
		while (true) {
			
			String stringQuery="select prog_ref,app_name, parent_ref, prog_order, menu_title_eng, disp_order from opt where prog_ref = '"+optName+"' and app_name = 'RETP'";
			ResultSet executeQuery = stmt.executeQuery(stringQuery);
			while (executeQuery.next()) {
				optName = executeQuery.getString("PARENT_REF");
				prgRef = executeQuery.getString("PROG_REF");
				listOfOptName.add(idPrefix+prgRef);
			}
			if (optName.equals("ROOT"))
			{

				
				break;
			}
			
		}

	
	
		connection.close();
	return listOfOptName;

}


}
