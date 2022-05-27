package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GlobalFirst
 */
public class GlobalState extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GlobalState() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head><title>HelloWorld</title></head><body>");
       /* Enumeration<String> names = request.getParameterNames();
        while(names.hasMoreElements()) {
        	String parameterName = names.nextElement();
        	System.out.println(parameterName);
        	String[] values = request.getParameterValues(parameterName);
        	int length = values.length;
        	for(int i=0; i<length; i++) {
        		System.out.println("values: "+values[i]);
        	}
        }*/
        // Collection of Strings
        String submitValue = request.getParameter("submit");
    ServletContext ctx=this.getServletContext();//Get handle to servletContext maintained by TomCat Server
        if (submitValue.equals("set")) {
            String salaryInput = request.getParameter("salary");
            this.getServletContext().setAttribute("globalSalary", salaryInput);
          //  ctx.setAttribute("ctxsalary", salaryInput);//Store data in servletContext for all user
            //ctx.setAtrribute()stores the data in collection using key and value
            //ctxsalary=key, salaryInput= value.
            out.println("<hl>Value Set</hl>" + salaryInput);
        } else if (submitValue.equals("fetch")) {
            String contextSalary=(String) ctx.getAttribute("ctxsalary");
            if (contextSalary == null){
                out.println("<h1> Servlet context not yet set!!! </h1>");
            }
            else {
            out.println("<h1>Value Fetched</h1>" + contextSalary);//returning value from servletContext to html
            }
            
   
        }
        out.println("<input type=\'hidden' value='50000' name='bonus' id='bonus'/>");
        out.println("</body></html>");
        //data stored in servlets Context is multiuser, and can be
        // read or modified from all other servlets
    }



    }