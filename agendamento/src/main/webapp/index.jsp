<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC
"-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head></head>
	<body>

			<%@ include file="header.jsp" %>



		<div id="corpo">

			
			<br>
			
			<div id="form">
			<fieldset>
			<legend>Login</legend>
			<br>
			<form action="inicio.jsp" method="post">
				Login: <br><input type="text" name="login" required="required" size="50"/> <br></td>
				Senha: <br><input type="password" name="senha" required="required" size="50"/> <br></td>
				<br>
				<input type="submit" value="Entrar"></td>
			</form>
			</fieldset>
			
			</div> <!--  fim div form -->
			
			
</div> <!--  Fim da DIV Corpo -->

			<%@ include file="footer.jsp" %>
			
	</body>
</html>