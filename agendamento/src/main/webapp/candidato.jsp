<?xml version="1.0" encoding="ISO-8859-1"?>
<!DOCTYPE html PUBLIC
"-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head></head>
<body>

	<%@ include file="header.jsp"%>



	<div id="corpo">

			
			<br>
			
			<div id="form">
			<fieldset>
			<legend>Cadastro</legend>
			<form action="">
				Nome: <br><input type="text" name="nome" required="required" size="50"/> <br></td>
				CPF: <br><input type="text" name="cpf" required="required" size="50" pattern="[0-9]+$"/> <br></td>
				<br>
				<select size="1" name="sexo">
					<option selected value="sexo">Sexo</option>
					<option value="masc">Masculino</option>
					<option value="fem">Feminino</option>
				</select>
				<br><br>
				<input type="submit" value="Salvar"></td>
			</form>
			</fieldset>
			
			</div> <!--  fim div form -->
			
			<fieldset>
			<legend align="left">Cadidatos Cadastrados</legend>
			<div id="lista">
			<table>

				<thead>

					<tr>

						<th>Nome</th>

						<th>CPF</th>

						<th>Editar</th>

						<th>Excluir</th>

					</tr>

				</thead>

				<tbody>

					<tr>


						<td>Jose</td>

						<td>123456789</td>

						<td>X</td>

						<td>X</td>

					</tr>

					<tr>



						<td>Maria</td>

						<td>123456789</td>

						<td>X</td>

						<td>X</td>

					</tr>

					<tr>



						<td>Antonio</td>

						<td>123456789</td>

						<td>X</td>

						<td>X</td>

					</tr>

				</tbody>

			</table>
			</div> <!--  Fim div lista -->
			</fieldset>
			<br>
			<a href="inicio.jsp">Voltar</a>

</div> <!--  Fim da DIV Corpo -->
			
			
			<%@ include file="footer.jsp"%>
</body>
</html>