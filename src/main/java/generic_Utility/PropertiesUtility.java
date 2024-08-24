package generic_Utility;

import java.io.FileInputStream;
import java.util.Properties;


public class PropertiesUtility {
	
	public String getDataFromProperties(String data) throws Exception {
		
		FileInputStream fis = new FileInputStream(IconstantUtility.propertiesPath);
		 Properties POBJ = new Properties();
		 POBJ.load(fis);
		 String value = POBJ.getProperty(data);
		 return value;
	}

}
