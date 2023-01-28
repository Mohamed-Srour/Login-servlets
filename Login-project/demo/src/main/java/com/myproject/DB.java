package com.myproject;

import java.util.List;

import jakarta.persistence.*;

public class DB {



    // public boolean validat(String username, String pass) {
    //     EntityManagerFactory emf = Persistence.createEntityManagerFactory("mmd");
    //     EntityManager em = emf.createEntityManager();
    //     String queryString = "from users u where u.user_name like :n";
    //     Query q = em.createQuery(queryString).setParameter("name", username);
    //     int r = q.getFirstResult();
    //     List list = q.getResultList();
    //     if (r != 0) {

    //         users u = (users) list.get(r);
    //         if (u.getPass().equals(pass)) {
    //             return true;
    //         } else
    //             return false;

    //     } else
    //         return false;

    // }

  static  boolean checkUesrName_Pass(String userName,String pass,StringBuilder message)
    {
         boolean flag = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("md");
        EntityManager em = emf.createEntityManager();
        jakarta.persistence.Query q = em.createQuery("from users s where s.user_name like :name");     
         q.setParameter("name",userName);
         List list =  q.getResultList();
         if(list.size() != 0)
        {
         users s = (users)list.get(0);
          if(s.getUser_name().equals(userName)&& s.getPass().equals(pass))
          {
            return true ;
          }else 
          {
            message.append("incorect password");
            return false;
          }
        }
        message.append("user not found");
        return false;
     }

}
// users u=(users) list.get(i);
