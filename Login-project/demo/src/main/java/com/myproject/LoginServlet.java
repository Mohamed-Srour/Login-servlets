 package com.myproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        String user=req.getParameter("userNameLogin");
        String pass=req.getParameter("userPassLogin");
        
        if(DB.validat(user, pass))
        {
            out.print("<h1>welcome :"+user+"</h1>");
            // resp.sendRedirect("users.html");
            req.getRequestDispatcher("users.html").include(req, resp);
            
        }
        else
        {
            out.println("invalde username or password");
            // req.getRequestDispatcher("index.html").include(req, resp);
            resp.sendRedirect("index.html");
        }
    }


}



