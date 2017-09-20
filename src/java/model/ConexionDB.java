/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionDB {
    //Class.forName ("oracle.jdbc.driver.OracleDriver");
    public static ConexionDB instance;
    private Connection  cnn;
    
    private final String BD_USERNAME="PRUEBA";
    private final String BD_PASSWORD="PRUEBA";
    private final String BD_SERVER="192.168.56.150";
    private final String BD_PORT="1521";
    private final String BD_DBNAME="ORCL";
    private String tns="jdbc:oracle:thin:@//"+BD_SERVER+":"+BD_PORT+"/"+BD_DBNAME;
    //jdbc:oracle:thin:@//192.168.56.150:1521/ORCL
    
    private ConexionDB()
    {
        try {
            Class.forName ("oracle.jdbc.driver.OracleDriver");
            cnn= DriverManager.getConnection(tns, BD_USERNAME, BD_PASSWORD);
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized static ConexionDB getEstadoBD()
    {
        if ( instance==null)
        {
            instance=new ConexionDB();
        }
        return instance;
        
    }
    
    public Connection getCnn()
    {
        return cnn;
    }
    
    public void closeConexion()
    {
        instance =null;
    }
    
    }


