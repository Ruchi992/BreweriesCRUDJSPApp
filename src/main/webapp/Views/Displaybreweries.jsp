<%-- 
    Document   : Displaybreweries
    Created on : 7 Mar 2020, 14:21:11
    Author     : Ruchi Devi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Breweries</title>
    </head>
    <body>
        <table style="width:100%">
            <tr>
             <th align="left">ID</th>
             <th align="left">Name</th>
             <th align="left">ADDRESS1</th>
             <th align="left">ADDRESS2</th>
             <th align="left">Fax</th>
             <th align="left">Phone</th>
             <th align="left">Email</th>
             <th align="left">Actions</th>
            </tr>
            <c:forEach items="${breweriesList}" var="item"> 
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.address1}</td>
                    <td>${item.address2}</td>
                    <td>${item.phone}</td>
                    <td>${item.phone}</td>
                    <td>${item.email}</td>
                    <td>
                        <a href="">Delete</a>
                        <a href="">Edit</a>
                        <a href="">Insert</a>
                    </td>
                   
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
