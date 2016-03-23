<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="contato" class="br.com.locadora.jdbc.dao.ClienteDAO"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Clientes</title>
<link type="text/css" href="css/lista.css" rel="stylesheet" />
</head>
<body>
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
			<td>Excluir</td>
			<td>Alterar</td>
		</tr>
	<core:forEach var="clientes" items="${contato.lista}">
		<tr>
			<td>${clientes.nome}</td>
			<td>${clientes.RG}</td>
			<td>${clientes.CPF}</td>
			<td>${clientes.telefone}</td>
			<td>${clientes.sexo}</td>
			<td>${clientes.email}</td>
			<td> <fmt:formatDate value="${clientes.datadnascimento.time}" pattern="dd/MM/yyyy"/> </td>
			<td>${clientes.numeroderegistro}</td>
			<td>${clientes.estadoemissor}</td>
			<td> <fmt:formatDate value="${clientes.validadeCNH.time}" pattern="dd/MM/yyyy"/>  </td>
			<td><a href="mvc?logica=RemoverContatoLogic&id=${clientes.codigoCliente}">Remover</a></td>
			<td><a href="mvc?logica=ListarClienteLogic&id=${clientes.codigoCliente}">Alterar</a></td>
		</tr>
	</core:forEach>
	</table>
</body>
</html>