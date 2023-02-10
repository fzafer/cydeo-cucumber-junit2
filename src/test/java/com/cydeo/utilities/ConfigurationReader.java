package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1. create obj of properties class

    private static Properties properties = new Properties();

    static {

        try {
            //2. open the file in the java memory
            FileInputStream file = new FileInputStream("configuration.properties");
            //right click on configurati on.properties, copy path, content root

            //3. load the prop obj
            properties.load(file); //throws extension ekledik

            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
