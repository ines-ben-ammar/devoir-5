<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css"
href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Articles</title>
</head>
<body>
<div class="container mt-5">
<div class="card">
 <div class="card-header">
 Liste des Articles
 </div>
 <div class="card-body">

 <table class="table table-striped">
 <tr>
<th>ID</th><th>libelle</th><th>description</th><th>marque</th><th>prix</th><th>DateCréation</th><th>Suppression</th><th>Edition</th>
 </tr>
 <c:forEach items="${articles}" var="a">
 <tr>
 <td>${a.idArticle }</td>
 <td>${a.libelle}</td>
 <td>${a.description }</td>
 <td>${a.marque}</td>
 <td>${a.prixUnitaire }</td>
 <td><fmt:formatDate pattern="dd/MM/yyyy"
value="${a.dateCreation}" /></td>
 <td><a onclick="return confirm('Etes-vous sûr ?')"
href="supprimerArticle?id=${a.idArticle }">Supprimer</a></td>
 <td><a href="modifierArticle?id=${a.idArticle }">Edit</a></td>
 </tr>
 </c:forEach>
 </table>
 </div>
</div>
</div>
</body>
</html>