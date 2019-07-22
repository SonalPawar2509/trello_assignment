package com.trello.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class ConfigUtil {
    static Logger log = Logger.getLogger(ConfigUtil.class);
    static Properties prop = new Properties();

    // load a properties file
    public static String getProperty(String locator) {
        InputStream input;
        String propertyValue = "";
        try {
            input = new FileInputStream(getRootDir() + "/src/test/resources/application.properties");
            prop.load(input);
            propertyValue = prop.getProperty(locator);
        } catch (IOException e) {
            log.log(Level.ERROR, "Unable to read properties file", e);
        }
        ;
        return propertyValue;
    }

    public static String getRootDir() {
        return System.getProperty("user.dir");
    }
}