/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.mycompany.action;

import com.java.mycompany.dao.UserDao;
import com.java.mycompany.model.User;
import com.java.mycompany.utils.Constants;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author itcrc
 */
public class UserAction implements Action{
    
    
    private Integer mode;
    
    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest() ;
        String name = request.getParameter("username");
        String password = request.getParameter("password");
         
        if(!validateString(name) ||  !validateString(password)){
            return ActionSupport.ERROR;
        }
        UserDao userDao = new UserDao();
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        userDao.saveUser(user);
        this.mode = Constants.NORMALMODE;
        return ActionSupport.SUCCESS;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }
    

    
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }
    
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    private boolean validateString(String str) {
        return (str != null && !str.equals(""));
    }
    
    
 
}
