/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servlet;

import com.mycompany.logica.controlador.ControladorMovimientos;
import com.mycompany.logica.modelo.Modelo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class MiPrimerServlet extends HttpServlet {

    Modelo modelo;
    ControladorMovimientos controlador;

    public MiPrimerServlet() {
        modelo = new Modelo();
        controlador = new ControladorMovimientos(modelo);
        //modelo.mostrarTablero();
    }


    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String comando = request.getParameter("comando");
            
            String[] parts = comando.split(",");
            int posInicialI = Integer.parseInt(parts[0]);
            int posInicialJ = Integer.parseInt(parts[1]);
            int posFinalI = Integer.parseInt(parts[2]);
            int posFinalJ = Integer.parseInt(parts[3]);

            if (controlador.mover(posInicialI, posInicialJ, posFinalI, posFinalJ)) {                
                out.println("{");
                out.println("\"comando\":\"" + "true" + "\"");
                out.println("}");
            } else if (!controlador.mover(posInicialI, posInicialJ, posFinalI, posFinalJ)) {                
                out.println("{");
                out.println("\"comando\":\"" + "false" + "\"");
                out.println("}");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
