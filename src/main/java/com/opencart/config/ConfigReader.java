package com.opencart.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    public ConfigReader() {
        properties = new Properties();

        try (FileInputStream fis =
                     new FileInputStream("src/test/resources/config.properties")) {

            properties.load(fis);

        } catch (IOException e) {
            throw new RuntimeException(
                    "Unable to load config.properties", e
            );
        }
    }

    public String getBaseURL() {
        return properties.getProperty("baseURL");
    }

    public int getExplicitWait() {
        return Integer.parseInt(
                properties.getProperty("explicitWait", "10")
        );
    }

    public String getUsername() {
        return properties.getProperty("username");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }
}