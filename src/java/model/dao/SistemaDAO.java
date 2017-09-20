/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import interfaces.Obligatorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.SistemaDTO;
import model.ConexionDB;


/**
 *
 * @author DIAZF.JORGE
 */
public class SistemaDAO implements Obligatorio<SistemaDTO> {
    // QUITAR CERO POR SECUENCIA
     private static final String SQL_INSERT=" INSERTO INTO ";
     private static final String SQL_DELETE="";
     private static final String SQL_UPDATE="";
     private static final String SQL_READ="SELECT * FROM TB_GA_SISTEMA WHERE ID_SISTEMA=?";
     private static final String SQL_READALL="SELECT * FROM TB_GA_SISTEMA";
    private static final ConexionDB CONDB=ConexionDB.getEstadoBD();

    @Override
    public boolean Create(SistemaDTO g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(SistemaDTO g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SistemaDTO Read(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SistemaDTO> ReadALL() {
         PreparedStatement ps;
             ResultSet  res;
             SistemaDTO s=null;
             ArrayList<SistemaDTO> sistemas=new ArrayList();
         try {
             ps=CONDB.getCnn().prepareCall(SQL_READALL);
             res=ps.executeQuery();
             while (res.next())
             {
            sistemas.add(new SistemaDTO(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getInt(7),res.getInt(8),res.getInt(9),res.getInt(10),res.getString(11)));
             }
         } catch (SQLException ex) {
             Logger.getLogger(SistemaDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return sistemas;
    }
    
}
