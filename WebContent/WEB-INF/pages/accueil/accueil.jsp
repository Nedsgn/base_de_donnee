<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
<link rel="stylesheet" href="ressources/css/accueil.css" />
</head>
<body>
<h1>Les bases de données</h1>
<p>On récupère ce qu'il y a dans la table ville qui se trouve dans la database jee</p>
<ul>
<!-- le foreach parcours un tableau de chaines de caractere -->
<c:forEach items="${villes }" var="ville">
<li>${ville }
</li>
</c:forEach>
</ul>

<a href="animaux">Animaux</a>
</body>
</html>