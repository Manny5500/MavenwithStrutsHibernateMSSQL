/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.mycompany.dao;

import com.java.mycompany.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author itcrc
 */
public class UserDao {
    
    private final SessionFactory factory;
    
    public UserDao() {
        factory = new Configuration().configure("hibernate.cfg.xml")
                                     .addAnnotatedClass(User.class)
                                     .buildSessionFactory();
    }
    
    public void saveUser(User user){
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }
    
    public User getUser(Long id){
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        User user =  (User) session.get(User.class,id);
        session.getTransaction().commit();
        return user;
    }
    
    
}
