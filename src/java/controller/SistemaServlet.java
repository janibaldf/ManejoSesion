/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.SistemaDAO;
import model.dto.SistemaDTO;

@WebServlet("/Sistemas")
public class SistemaServlet extends HttpServlet  {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SistemaDAO s=new SistemaDAO();
        List<SistemaDTO> ss= s.ReadALL();
         Iterator<SistemaDTO> sistemas = ss.iterator();
        request.setAttribute("sistemas",sistemas); // Will be available as ${products} in JSP
        request.getRequestDispatcher("/sistema/list.jsp").forward(request, response);
    }
}
