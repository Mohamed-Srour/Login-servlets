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
        // DB u=new DB();
        // boolean b=u.validat(user, pass);
        if(DB.checkUesrName_Pass(user, pass,new StringBuilder()))
        {
            req.getRequestDispatcher("welcome").forward(req, resp);
        }
        else
        {
            out.println("invalde username");
            req.getRequestDispatcher("index.html").include(req, resp);
        }
    }


    // public boolean validat(String username, String pass) 
    // {
    //     // EntityManagerFactory emf = Persistence.createEntityManagerFactory("md");
    //     // EntityManager em=emf.createEntityManager();
    //     // String queryString = "from users u where u.user_name like :name";
    //     // Query q=em.createQuery(queryString).setParameter("name", username);
    //     // int r = q.getFirstResult();
    //     // List list = q.getResultList();

    //     if (r != 0) 
    //     {

    //         users u = (users) list.get(r);
    //         if (u.getPass().equals(pass)) 
    //         {
    //             return true;
    //         } 
    //         else
    //             return false;

    //     } else
    //         return false;

    // }
}



