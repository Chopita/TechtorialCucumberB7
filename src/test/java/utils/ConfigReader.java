package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {

        String path = "configuration.properties";
        try {
            //FileInputstream will open the file
            FileInputStream input = new FileInputStream(path);
            //load method will store every value from properties file to the properties object
            properties = new Properties();
            properties.load(input);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
