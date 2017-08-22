/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.DAO_Booking;
import Entity.e_booking;
import Entity.e_kamar;
import Entity.e_pelanggan;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lukas
 */
@WebServlet(name = "insertServlet", urlPatterns = {"/insertServlet"})
public class insertServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        e_kamar kmr = new e_kamar();
        kmr.setKode_kamar(request.getParameter("kode_kamar"));
        kmr.setNama_kamar(request.getParameter("nama_kamar"));
        kmr.setLantai_kamar(request.getParameter("lantai_kamar"));
        kmr.setTipe_kamar(request.getParameter("tipe_kamar"));
        kmr.setHarga(request.getParameter("harga"));
        
        List<e_kamar> list = new ArrayList<>();
        list.add(kmr);
        
        e_pelanggan plg = new e_pelanggan();
        plg.setKode_pelanggan(request.getParameter("kode_pelanggan"));
        plg.setNama(request.getParameter("nama"));
        plg.setAlamat(request.getParameter("alamat"));
        plg.setNo_telepon(request.getParameter("no_telepon"));
        plg.setEmail(request.getParameter("email"));
        plg.setPassword(request.getParameter("password"));
        
        List<e_pelanggan> list1 = new ArrayList<>();
        list1.add(plg);
        
        e_booking book = new e_booking();
        book.setKode_kamar(request.getParameter("kode_kamar"));
        book.setNama_kamar(request.getParameter("nama_kamar"));
        book.setKode_pelanggan(request.getParameter("kode_pelanggan"));
        book.setNama(request.getParameter("nama"));
        book.setHarga(request.getParameter("harga"));
        book.setCheck_in(request.getParameter("check_in"));
        book.setCheck_out(request.getParameter("check_out"));
        
        List<e_booking> list2 = new ArrayList<>();
        list2.add(book);
        
        kmr.setE_booking(book);
        plg.setE_booking(book);

        book.setKamarList(list);
        book.setPelangganList(list1);

        DAO_Booking d_book = new DAO_Booking();
        d_book.create(book);
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
