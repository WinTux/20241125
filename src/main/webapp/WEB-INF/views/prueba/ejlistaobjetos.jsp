<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo lista de objetos</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Foto</th>
			<th>Precio</th>
			<th>Cantidad</th>
			<th>Total</th>
		</tr>
		<c:forEach var="p" items="${prods}">
			<tr>
				<td>${p.id}</td>
				<td>${p.nombre}</td>
				<td><img src="${pageContext.request.contextPath}/assets/imagenes/${p.foto}" width="100"></td>
				<td>${p.precio}</td>
				<td>${p.cantidad}</td>
				<td>${p.precio * p.cantidad}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>