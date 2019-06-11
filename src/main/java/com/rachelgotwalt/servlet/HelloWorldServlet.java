package com.rachelgotwalt.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * A basic servlet to demonstrate the application
 */
public class HelloWorldServlet extends HttpServlet {

    /**
     * Handles a GET request by printing "Hello World!!!" to the user.
     *
     * @param request the incoming request
     * @param response the outgoing response
     * @throws IOException if an IO exception occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("Hello World!!!");
    }

}
