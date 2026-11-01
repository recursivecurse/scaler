package com.example.servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.example.models.User;
import com.example.service.UserService;


@WebServlet("/user")
public class UserServlet extends HttpServlet{

    private UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        

        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phoneNo = req.getParameter("phoneNo");

        if(null == id || null == name) {
            resp.setStatus(400);
            resp.setContentType("application/json");

            resp.getWriter().write(

                "{"
                + "\n" + " \"message\" : " + " \"Missing required fields\" " 
                + "\n" 
                +"}"
                
            );
        }

        else{

            User user =  userService.saveUser(new User(Integer.parseInt(id),name,email,phoneNo));

            if(null == user) { 
                //Added user successfully
                resp.setStatus(201);
                resp.setContentType("application/json");

                resp.getWriter().write(
                     "{"
                    + "\n" + " \"message\" : " + " \"User added successfully\" " 
                    + "\n" 
                    +"}"
                );
            }
        }
        //User exists

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub

        String id = req.getParameter("id");
        if(null == id) {
            List<User> users = userService.getAllUsers(); 

                if(users.isEmpty()) {

                resp.setStatus(404);
                resp.setContentType("application/json");

                resp.getWriter().write(
                    
                    "{"
                    + "\n" + " \"message\" : " + " \"Users not found\" " 
                    + "\n" 
                    +"}"

                );
            }
            else{
                resp.setStatus(200);
                resp.setContentType("application/json");

                
                StringBuilder s = new StringBuilder();
                s.append("[");
                s.append("\n");
                for(User user : users) {
                    s.append("\t");
                    s.append(userToJson(user));
                    s.append(",");
                    s.append("\n");
                }
                s.append("\n");
                s.append("]");

                resp.getWriter().write(s.toString());
                
            }

        }

        else{
            
            User user = userService.getUser(Integer.parseInt(id));

            if(null == user) {

                resp.setStatus(404);
                resp.setContentType("application/json");

                resp.getWriter().write(
                    
                    "{"
                    + "\n" + " \"message\" : " + " \"User not found \"" 
                    + "\n" 
                    +"}"

                );
            }

            else{
                resp.setStatus(200);
                    resp.setContentType("application/json");

                    resp.getWriter().write(

                       userToJson(user)
                        
                    );

            }

        }
    }


    public static String userToJson (User user) { 

        return "{"
                + "\n" +  "\"id\" : \"" +user.getId() +"\","
                + "\n" +  "\"name\" : \"" +user.getName() +"\","
                + "\n" +  "\"email\" : \"" +user.getEmail() +"\","
                + "\n" +  "\"phoneNo\" : \"" +user.getPhoneNo() +"\""
                + "\n"
                +"}" ;
    }
    
    
}
