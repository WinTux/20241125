<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo de objeto</title>
</head>
<body>
	<h2>Detalles del producto</h2>
	<table border="1">
		<tr>
			<td>ID:</td>
			<td>${prod.id}</td>
		</tr>
		<tr>
			<td>Nombre:</td>
			<td>${prod.nombre}</td>
		</tr>
		<tr>
			<td>Foto:</td>
			<td><img alt="Producto disponible" src="${pageContext.request.contextPath}/assets/imagenes/${prod.foto}" width="100"></td>
		</tr>
		<tr>
			<td>Precio</td>
			<td>${prod.precio}</td>
		</tr>
		<tr>
			<td>Cantidad</td>
			<td>${prod.cantidad}</td>
		</tr>
		<tr>
			<td>Total</td>
			<td>${prod.cantidad * prod.precio}</td>
		</tr>
	</table>
</body>
</html>