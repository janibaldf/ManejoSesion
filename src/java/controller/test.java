/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Iterator;
import java.util.List;
import model.dao.SistemaDAO;
import model.dto.SistemaDTO;

/**
 *
 * @author DIAZF.JORGE
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SistemaDAO s=new SistemaDAO();
        List<SistemaDTO> ls= s.ReadALL();
        Iterator<SistemaDTO> it = ls.iterator();
 
while (it.hasNext()) {
 
System.out.println(it.next().getNombreCorto());
 
}
      
            
       
    }
    
}
