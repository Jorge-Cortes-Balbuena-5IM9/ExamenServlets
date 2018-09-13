package Convertidor;

import   java.io.*;
import   javax.servlet.*;
import   javax.servlet.http.*;
 
public   class   Convertidor  extends   HttpServlet
{
public   void   doPost(HttpServletRequest   req,   HttpServletResponse res)
throws   ServletException,   IOException
    {
    double   num;
    int   moneda;

    ServletOutputStream   out   =   res.getOutputStream();

    num   =   Double.parseDouble(req.getParameter("num"));
    moneda = Integer.parseInt(req.getParameter("moneda"));


    
    if(moneda == 1){
    out.println("<html>");
    out.println("<head><title>Resultado</title></head>");
    out.println("<body>");
    out.println("<h2><center>La conversion de pesos a dolares es de:</center></h2>");
    out.println("<h4><center>"+  num/20   +"</center></h4>");
    out.println("</body>");
    out.println("</html>");
    out.close();
    }
    else
    if(moneda == 2){
    out.println("<html>");
    out.println("<head><title>Resultado</title></head>");
    out.println("<body>");
    out.println("<h2><center>La conversion de pesos a yenes es de:</center></h2>");
    out.println("<h4><center>"+  num*20   +"</center></h4>");
    out.println("</body>");
    out.println("</html>");
    out.close();
    }
    }
}
