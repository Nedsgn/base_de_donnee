<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gardiens</title>
<link rel="stylesheet" href="ressources/css/gardien/gardien.css" />

</head>
<body>
<h1>Les gardiens du zoo</h1>


<table>

<tr>

<th>Nom</th> 
<th>Prénom</th> 

<th>Numéro</th>
<th>Age</th>
<th>Photo</th>


</tr>



<c:forEach items="${Gardien}" var="gar">

<tr>

<td>${gar.nom }</td>
<td>${gar.prenom }</td>
<td>${gar.numero }</td>
<td>${gar.age }</td>
<td><img src="${gar.urlImage }"/></td>

</tr>
</c:forEach>

</table>



</body>
</html>