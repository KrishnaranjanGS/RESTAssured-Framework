package com.reqres.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReqresConfigReader {

    private static Properties prop;

    static {
        try {
            prop = new Properties();
//          FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            InputStream fis = ReqresConfigReader.class.getClassLoader().getResourceAsStream("config.properties");

            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config file", e);
        }
    }
    
    public static String get(String key) {
        return prop.getProperty(key);
    }

}
