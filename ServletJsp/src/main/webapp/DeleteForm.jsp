<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="forBorrar" method="post"> 
	<!--
	
	IMPORTANTE:
	El action debe coincidir con <url-pattern> </url-pattern> de web.xml
	
	-->
		<table align="center" border="1px">
		<tr>
			<td>Nombre:</td>
			<td><input type="text" id="nombreB" name="nombreB" value="javier"></td>
		</tr>
		 
		<tr>
			<td>Fecha de nacimiento:</td>
			<td><input type="text" id="edadB" name="edadB" value="20"></td>
		</tr> 
		 
		<tr>
			<td>Curso:</td>
			<td><input type="text" id="cursoB" name="cursoB" value="2h"></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center"><input type="submit" value="Enviar"></td>
		</tr>
		
	</table>
	</form>
	</body>
</html>