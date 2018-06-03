/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.sun.java.swing.plaf.windows.WindowsBorders;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taipham
 */
public class DataProvider {
    private Connection conn;
    private String url, userName, password, port;
    
    public DataProvider(){
        this.conn = null;
        this.url = this.userName = this.password = "";
    }
    
    public void readFileProperties() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Properties properties = new Properties();
        try {
            properties.load(classLoader.getResourceAsStream("config.properties"));
            url = properties.getProperty("url");
            String hostName = properties.getProperty("hostname");
            String databaseName = properties.getProperty("databasename");
            userName = properties.getProperty("username");
            password = properties.getProperty("password");
            port = properties.getProperty("port");
            url = url + hostName + ":3306/" + databaseName;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Connection getDataConnection(){
        conn = null;
        readFileProperties();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
    
    public void closeConnection(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        Connection conn = dataProvider.getDataConnection();
        
        
        if (conn == null) {
            System.out.println("something wrong!");
          } else {
            System.out.println("Ok");
        }
    }
}
