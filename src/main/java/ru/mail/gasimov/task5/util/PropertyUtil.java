package ru.mail.gasimov.task5.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {

    private static final Logger logger = LogManager.getLogger();
    private static final String CONFIG_PROPERTY_FILE_LOCATION = "config.properties";

    private Properties properties;

    public PropertyUtil() {
        this.properties = new Properties();
        try {
            InputStream propertiesStream = getClass().getClassLoader().getResourceAsStream(CONFIG_PROPERTY_FILE_LOCATION);
            properties.load(propertiesStream);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
            throw new IllegalArgumentException("Config property file is not found");
        }
    }

    public String getProperty(String name) {
        return properties.getProperty(name);
    }

}



