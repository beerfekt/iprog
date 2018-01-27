<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MVC-Demo</title>
</head>
<body>
	<h3>Dateneingabe</h3>
	<jsp:useBean id="person" scope="request" class="data.Person" />

	<form action="register" method="get">
		<table>
			<tr>
				<td>Vorname</td>
				<td><input type="text" name="vname"
					value="<jsp:getProperty name="person" property="vorname"/>">
				</td>
			</tr>
			<tr>
				<td>Nachname</td>
				<td><input type="text" name="nname"
					value="<jsp:getProperty name="person" property="nachname"/>">
				</td>
			</tr>
		</table>
		<br> <input type="submit" value="Daten senden">
	</form>

</body>
</html>