package ru.geekbrains;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/first_servlet")
public class FirstServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

