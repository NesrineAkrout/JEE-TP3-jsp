<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="Stock.Classes.Produit" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>R�sultats de la recherche</title>
</head>
<body>
 <h1>R�sultats de la recherche</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Libell�</th>
            <th>Cat�gorie</th>
            <th>Marque</th>
            <th>Quantit�</th>
            <th>Prix</th>
        </tr>
        <%
            List<Produit> resultats = (List<Produit>) request.getAttribute("resultats");
            
        for (Produit produit : resultats) {
        %>
        <tr>
            <td><%= produit.getId() %></td>
            <td><%= produit.getLibelle() %></td>
            <td><%= produit.getCategorie() %></td>
            <td><%= produit.getMarque() %></td>
            <td><%= produit.getQuantite() %></td>
            <td><%= produit.getPrix() %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>