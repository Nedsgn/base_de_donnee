<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Animaux</title>
<link rel="stylesheet" href="ressources/css/animaux/animaux.css" />

</head>
<body>

	<h1>Animaux contenus dans la bdd</h1>


<div id="conteneur">
		<c:forEach items="${ listeNomAnimaux}" var="animal" varStatus="indice">
	<p><strong>Nom:</strong> ${animal }</p>
					
		</c:forEach>
		
	
</div>
<h2>TYPES</h2>
<div id="conteneur">

	<c:forEach items="${ typeAnimaux}" var="type" varStatus="indice">
	<p><strong>Nom:</strong> ${type }</p>
					
		</c:forEach>
		
		</div>
		
		<h2>ESPERANCE DE VIE</h2>
<div id="conteneur">

	<c:forEach items="${ vieAnimaux}" var="vie" varStatus="indice">
	<p><strong>Durée de vie:</strong> ${vie } ans</p>
					
		</c:forEach>
		
		</div>
		
				<h2>POIDS</h2>
<div id="conteneur">

	<c:forEach items="${ poidsAnimaux}" var="poids" varStatus="indice">
	<p><strong>Poids:</strong> ${poids } kg</p>
					
		</c:forEach>
		
		</div>
		<a href="accueil">Retour</a>

</body>
</html>