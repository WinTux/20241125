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
	<s:url var="ejemplourl_1param" namespace="/prueba" action="ejemplourl">
		<s:param name="valor1">Pepe Perales</s:param>
	</s:url>
	<s:a href="%{ejemplourl_1param}">Página para URL</s:a> |
	<s:url var="acercade_2param" namespace="/prueba" action="acercade">
		<s:param name="valor2">1234</s:param>
		<s:param name="valor3">Av. SiempreViva</s:param>
	</s:url>
	<s:a href="%{acercade_2param}">Acerca de nosotros</s:a> |
	<s:a namespace="/prueba" action="ejemploobjetos">Contactos</s:a><br>
	<s:a namespace="/prueba" action="ejemplolistaobjetos">Ejemplo con una lista de objetos</s:a> <br>
	<s:a namespace="/prueba" action="redireccion">Ejemplo de redirección 1</s:a> |
	<s:url var="redir2_2param" namespace="/prueba" action="redireccion2">
		<s:param name="valor2">54321</s:param>
		<s:param name="valor1">Samantha Rocha</s:param>
	</s:url>
	<s:a href="%{redir2_2param}">Ejemplo de redirección con parámetros</s:a> |
	
	<h2 class="formateado">Valores pasados desde el controlador</h2>
	Edad: ${edad} <br>
	Nombre: ${nombre} <br>
	Estatura: ${estatura} <br>
	Disponible: ${disponible}<br>
	
</body>
</html>