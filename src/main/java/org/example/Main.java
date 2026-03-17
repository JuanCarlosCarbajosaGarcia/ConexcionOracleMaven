package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                DBConfig.getUrl(),
                DBComfig.getUser(),
                DBConfig.getPassword())){
            System.out.println("Conectado exitosamente");
        }catch (SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}