/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;

/**
 *
 * @author rishabh
 */
public class contactus_pat extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
        try
        {
            
            
            String recp= "cardiac.info.contermeasure@gmail.com";
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String sub = request.getParameter("subject");
            String text = request.getParameter("text");
            
            String subject =" "+sub+" ";
                        String content = "Hi, " + name +" "+ "has send you responce "
                                + ".\n" + text + ".\n  ";
                        String mail = recp;

                        String[] recipients = new String[]{mail};
                        //String[] bccRecipients = new String[]{"sunilkotadiya777@gmail.com"};  

                        if (new MailUtil().sendMail(recipients, subject, content)) {

                        }
                        request.setAttribute("msg", "Your responce has been submited thank you..!");
                    
             
            
          
             RequestDispatcher rd = request.getRequestDispatcher("contactus_pat.jsp");
             rd.forward(request, response);
        
        }
        catch(HibernateException he)
        {
           out.println(he.getMessage());
        }
        
        finally
        {
            
            out.close();
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
