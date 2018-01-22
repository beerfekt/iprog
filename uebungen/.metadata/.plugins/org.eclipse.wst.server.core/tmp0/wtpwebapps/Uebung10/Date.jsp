<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Server-Datum</title>
</head>
<body>

	<jsp:directive.page import="java.util.Date" />
	<%@ page import="java.text.SimpleDateFormat" %>
	<%@ page import="java.util.Locale" %>
	
	<%!
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, d. MMMM  YYYY HH:mm", Locale.GERMAN);
	%>
	
	<h1><%= sdf.format(d) %></h1>

</body>
</html>