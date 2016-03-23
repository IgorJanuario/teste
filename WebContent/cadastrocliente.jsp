<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" href="css/estilo.css" rel="stylesheet"/>
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script type="text/javascript" src="javascript/jquery.mask.min.js"></script>
<script type="text/javascript" src="javascript/jquery.mask.js"></script>
<script type="text/javascript" src="javascript/script.js"></script>
<title>Cadastro de Cliente</title>
</head>
<body>

	<form method="POST" action="mvc?logica=PrimeiraLogica">
		
		<table>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome"/></td>
			</tr>
			<tr>			
				<td>RG:</td>
				<td><input class="rg" type="text" name="RG"/></td>
			</tr>
			
			<tr>
			<td>CPF:</td>
			<td><input class="cpf" type="text" name="CPF"/></td>
			</tr>
			
			<tr>
			<td>Telefone:</td>
			<td><input class="tel" type="text" name="telefone"/></td>
			</tr>

			<tr>
			<td>Genero:<br/>
			<input id="opcao" type="radio" name="sexo" value="masculino"/>Masculino<br/>
			<input id="opcao" type="radio" name="sexo" value="feminino"/>Feminino</td>	
			</tr>
			
			<tr>
			<td>Email:</td>
			<td><input type="text" name="email"/></td>
			</tr>
			
			<tr>
			<td>Data de Nascimento:</td>
			<td><input class="data" type="text" name="datadenascimento"/></td>
			</tr>
			
			<tr>
			<td>Numero de Registro:</td>
			<td><input type="text" name="numeroderegistro"/></td>
			</tr>
			
			<tr>
			<td>Estado Emissor:</td>
			<td><input type="text" name="estadoemissor"/></td>
			</tr>
			
			<tr>
			<td>Validade da CNH:</td>
			<td><input class="data" type="text" name="validadeCNH"/></td>
			</tr>
			
			<tr>
			<td><input id="confirma" type="submit" value="Cadastrar"/></td>
			</tr>
		</table>
	</form>
</body>
</html>