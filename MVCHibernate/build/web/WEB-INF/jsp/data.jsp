<%-- 
    Document   : data
    Created on : 2018-05-28, 13:36:46
    Author     : bitel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        ${test}
        <table style="border-collapse: collapse" cellpadding="7px" border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Surname</th>
                <th>Address</th>
                <th>Nationality</th>
                <th>Document_ID</th>
                <th>Email</th>
                <th>Discount</th>
                <th>Fine</th>
            </tr>
            
            <c:forEach items="${lst}" var="c">
                <tr>
                    <td>${c.customerId}</td>
                    <td>${c.customerName}</td>
                    <td>${c.customerSurname}</td>
                    <td>${c.address}</td>
                    <td>${c.nationality}</td>
                    <td>${c.documentId}</td>
                    <td>${c.email}</td>
                    <td>${c.discount}</td>
                    <td>${c.fine}</td>
                    
                    <td>
                        <a href="$">
                            Edit
                        </a>
                        <a href="$" onclick="return confirm('Are you sure?')">Remove</a>
                    </td>
                </tr>
            </c:forEach>
        
        </table>
        
    </body>
</html>
