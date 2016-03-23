<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Cliente</title>
<link type="text/css" href="css/estilo.css" rel="stylesheet"/>
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script type="text/javascript" src="javascript/jquery.mask.min.js"></script>
<script type="text/javascript" src="javascript/jquery.mask.js"></script>
<script type="text/javascript" src="javascript/script.js"></script>
</head>
<body>
	<form action="mvc?" method="POST">
	<table>
		<tr>
			<td>Nome</td>
			<td>RG</td>
			<td>CPF</td>
			<td>Telefone</td>
			<td>Sexo</td>
			<td>E-mail</td>
			<td>Data de Nascimento</td>
			<td>Numero de Registro</td>
			<td>Estado Emissor</td>
			<td>Data de Validade CNH</td>
			<td>Alterar</td>
		</tr>
		<core:forEach var="cliente" items="${clientes}">
		<tr>
			<td><input type="text" name="nome" value="${cliente.nome}"/></td>
			<td><input class="rg" type="text" name="RG" value="${cliente.RG}" /></td>
			<td><input class="cpf" type="text" name="CPF" value="${cliente.CPF}"/></td>
			<td><input class="tel" type="text" name="telefone" value="${cliente.telefone}"/></td>
			<td>Sexo</td>
			<td><input type="text" name="email" value="${cliente.email}"/></td>
			<td><input class="data" type="text" name="datadenascimento"/></td>
			<td><input type="text" name="numeroderegistro" value="${cliente.numeroderegistro}"/></td>
			<td><input type="text" name="estadoemissor" value="${cliente.estadoemissor}"/></td>
			<td><input class="data" type="text" name="validadeCNH"/></td>
			<td><input type="submit" value="Alterar"/></td>
		</tr>
		</core:forEach>
	</table>
	</form>
</body>
</html>