<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ANIMAUX</title>
</head>
<body>
<h1>Les animaux</h1>


<table>

<c:forEach items="${animaux}" var="animal">
<tr> 
<td>${animal.nom }</td>
<td>${animal.type }</td>
<td>${animal.esperance_vie }</td>
<td>${animal.poids }</td>
</tr>
</c:forEach>

</table>



</body>
</html>