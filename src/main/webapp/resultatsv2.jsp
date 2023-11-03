<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Résultats de la recherche (Version 2)</title>
</head>
<body>
    <h1>Résultats de la recherche (Version 2)</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Libellé</th>
            <th>Catégorie</th>
            <th>Marque</th>
            <th>Quantité</th>
            <th>Prix</th>
        </tr>
        
        <c:forEach items="${resultats}" var="produit">
        
            <tr>
                
                <td><c:out value="${produit.id}" /></td>
                <td><c:out value="${produit.libelle}" /></td>
                <td><c:out value="${produit.categorie}" /></td>
                <td><c:out value="${produit.marque}" /></td>
                <td><c:out value="${produit.quantite}" /></td>
                <td><c:out value="${produit.prix}" /></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>