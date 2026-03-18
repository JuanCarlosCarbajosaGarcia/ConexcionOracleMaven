package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBConfig {
    private static final Properties props = new Properties();

    static {
        try {
            InputStream in = DBConfig.class.getClassLoader().getResourceAsStream("db.properties");
            props.load(in);
        }catch (IOException e) {
            throw new RuntimeException("Error al cargar db.properties", e);
        }
    }
    public static String getUrl(){
        return props.getProperty("db.url");
    }
    public static String getUser(){
        return props.getProperty("db.user");
    }
    public static String getPassword(){
        return props.getProperty("db.password");
    }
}
