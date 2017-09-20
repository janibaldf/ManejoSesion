/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DIAZF.JORGE
 */
public class Sistema {
  String SQL_SELEC_ALL="SELECT * FROM SISTEMA";
 private static final ConexionDB CON= ConexionDB.getEstadoBD();
  
 public void getAllSistema()
 {
      try {
          PreparedStatement ps;
          ps=CON.getCnn().prepareStatement(SQL_SELEC_ALL);
          
      } catch (SQLException ex) {
          Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
      }
         
         
 }

}
