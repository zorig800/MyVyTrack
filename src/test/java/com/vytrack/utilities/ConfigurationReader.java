package com.vytrack.utilities;

import com.github.javafaker.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {



   //1- Create the object of Properties
    private static Properties properties = new Properties();

    static {

     try{
         FileInputStream fileInputStream = new FileInputStream("configuration.properties");

         properties.load(fileInputStream);

         fileInputStream.close();

        }catch (IOException e) {
         System.out.println("File not found in the ConfigurationReader class");
         e.printStackTrace();
     }


    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
