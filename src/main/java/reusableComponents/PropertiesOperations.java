package reusableComponents;

import org.apache.commons.lang.StringUtils;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PropertiesOperations {
    static Properties prop = new Properties();
    public static String getPropertyValueByKey(String key) throws Exception {
        //load data
        FileInputStream fs= new FileInputStream("src/main/java/properties/config.properties");
            prop.load(fs);

        //2. read data
        String value = prop.get(key).toString();

        if(StringUtils.isEmpty(value)) {
            throw new Exception("Value is not specified for key: "+key + " in properties file.");
        }

        return value;
    }
}
