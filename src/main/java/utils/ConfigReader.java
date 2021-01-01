package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties prop;
    public String file = "src\\test\\resources\\config\\config.properties";


    /**
     * This method is used to load the properties file from config.properties file
     * @return
     */
    public Properties init_prop(){
        prop = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            prop.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }

}
