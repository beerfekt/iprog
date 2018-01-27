<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MVC-Demo</title>
</head>
<body>
	<h3>Neue Notiz</h3>

	<form action="NotizServlet" method="get">
		<input type="text" name="notiz" size="20"> <input
			type="submit" value="Speichern">
	</form>

	<h2>Meine Notizen</h2>

	<jsp:useBean id="notizen" scope="session" class="model.NotizContainer" />
	<jsp:getProperty property="asHtml" name="notizen" />

	<form action="NotizServlet" method="get">
		<input type="submit" name="delete" value="Notizen löschen">
	</form>

</body>
</html>