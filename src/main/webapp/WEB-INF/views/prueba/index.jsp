<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ejemplo de Struts</title>
	<link href="${pageContext.request.contextPath}/assets/css/estilos.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h3 class="formateado">Uso de etiquetas para URLs</h3>
	<s:a namespace="/prueba" action="ejemploobjetos">Ejemplo con objetos</s:a> |
	<s:a namespace="/prueba" action="ejemploobjetos">Página para URL</s:a> |
	<s:a namespace="/prueba" action="ejemploobjetos">Acerca de nosotros</s:a> |
	<s:a namespace="/prueba" action="ejemploobjetos">Contactos</s:a><br>
	<s:a namespace="/prueba" action="ejemplolistaobjetos">Ejemplo con una lista de objetos</s:a> |
	<h2 class="formateado">Valores pasados desde el controlador</h2>
	Edad: ${edad} <br>
	Nombre: ${nombre} <br>
	Estatura: ${estatura} <br>
	Disponible: ${disponible}<br>
	
</body>
</html>