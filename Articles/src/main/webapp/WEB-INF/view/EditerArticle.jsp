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
<title>Modifier un Article</title>
</head>
<body>
<div class="container mt-5">
<div class="card-body">
<form action="updateArticle" method="post">
 <div class="form-group">
 <label class="control-label">ID Article:</label>
 <input type="text" name="idArticle" value="${article.idArticle}"
readonly class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Libelle :</label>
 <input type="text" name="lieblle" value="${article.libelle}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Description :</label>
 <input type="text" name="description" value="${article.description}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Marque :</label>
 <input type="text" name="marque" value="${article.marque}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Prix:</label>
 <input type="text" name="prixUnitaire" value="${article.prixUnitaire}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label"> Date création :</label>
 <fmt:formatDate pattern="yyyy-MM-dd" value="${article.dateCreation}"
var="formatDate" />
 <input type="date" name="date" value="${formatDate}" class="formcontrol"/>
 </div>
 <div>
 <button type="submit" class="btn btn-primary">Modifier</button>
</div>
</form>
</div>
<br/>
<br/>
<a href="ListeArticles">Liste Articles</a>
</div>
</body>
</html>