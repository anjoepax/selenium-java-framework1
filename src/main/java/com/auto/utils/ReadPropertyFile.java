package com.auto.utils;

import com.auto.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {

    private ReadPropertyFile(){}

    private static final Properties property = new Properties();
    private static final Map<String, String> CONFIGMAP = new HashMap<>();

    static {
        try {
            FileInputStream file = new FileInputStream(FrameworkConstants.getConfigFilePath());
            property.load(file);
            property.forEach((key, value) -> CONFIGMAP.put(String.valueOf(key), String.valueOf(value)));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) throws Exception{
        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))) {
            throw new Exception("The property " + key + " is not found, please check config.properties file");
        }
        return CONFIGMAP.get(key);
    }
}
