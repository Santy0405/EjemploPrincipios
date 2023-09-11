<%-- 
    Document   : Figuras
    Created on : 11/06/2020, 10:41:40 a. m.
    Author     : 57320
--%>

<%@page import="Logica.FigurasGeometricas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% FigurasGeometricas fig = new FigurasGeometricas();
    fig = (FigurasGeometricas)session.getAttribute("figura");
    
    System.out.println(fig.getArea()+"holaaaaa");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= fig.getArea()%></h1>
    </body>
</html>
