package com.levik.greetings.configuration;

import java.util.Map;
import java.util.Properties;

public class ApplicationProperties extends Properties {

    private static ApplicationProperties instance;

    private ApplicationProperties() {
    }


    public static final ApplicationProperties get() {
        if (instance == null){
            instance = new ApplicationProperties();
            instance.putAll(loadProperties());
        }

        return instance;
    }

    protected static Properties loadProperties() {
        final Properties properties = new Properties();
        final Map<String, String> getenv = System.getenv();

        if (!getenv.isEmpty()){
            for (final String key : getenv.keySet()) {
                final String value = getenv.get(key);
                properties.put(key, value);
            }
        }

        return properties;
    }

}

