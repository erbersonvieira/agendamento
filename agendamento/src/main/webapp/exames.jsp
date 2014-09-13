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
				<!--Código: <br><input type="text" name="codigo" required="required" size="50"/> <br></td>-->
				Nome do Exame: <br><input type="text" name="nomeExame" required="required" size="50"/> <br></td>
				<br>
				<br>
				<input type="submit" value="Salvar"></td>
			</form>
			</fieldset>
			
			</div> <!--  fim div form -->
			
			<fieldset>
			<legend align="left">Exames Cadastrados</legend>
			<div id="lista">
			<table>

				<thead>

					<tr>

						<th>Código</th>

						<th>Descrição</th>

						<th>Editar</th>

						<th>Excluir</th>

					</tr>

				</thead>

				<tbody>

					<tr>


						<td>01</td>

						<td>Psicotécino</td>

						<td>X</td>

						<td>X</td>

					</tr>

					<tr>



						<td>02</td>

						<td>Exame de Vista</td>

						<td>X</td>

						<td>X</td>

					</tr>

					<tr>



						<td>03</td>

						<td>Legislação</td>

						<td>X</td>

						<td>X</td>

					</tr>

				</tbody>

			</table>
			</div> <!--  Fim div lista -->
			</fieldset>
			<br>
			<a href="inicio.html">Voltar</a>

</div> <!--  Fim da DIV Corpo -->
			
			
			<%@ include file="footer.jsp"%>
</body>
</html>