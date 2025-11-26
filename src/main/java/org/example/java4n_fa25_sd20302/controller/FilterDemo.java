package org.example.java4n_fa25_sd20302.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "FilterDemo", urlPatterns = "/filterInput")
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String username = servletRequest.getParameter("name");
        String password = servletRequest.getParameter("password");

        PrintWriter out = servletResponse.getWriter();

        if (username.equals("fpoly") & password.equals("123456")) {

            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            out.println("Invalid username or password");
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
