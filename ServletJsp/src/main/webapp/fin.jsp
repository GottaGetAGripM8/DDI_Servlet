<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head> 
<body>

		<div align="center">
		
				<table width=350>
					<tr>
						<td colspan="2" align="center"> <h2> DATOS INSERTADOS <hr></h2> </td>
					</tr>
					
					<tr>
						<td><h3>Nombre:</h3></td>
						<td id="nomS" name="nomS"><h3>${nombreS}</h3></td>
					</tr>
					 
					<tr>
						<td><h3>Edad:</h3></td>
						<td id="edaS" name="edaS"><h3>${edadS} a&ntildeos</h3></td>
					</tr>
					 
					<tr>
						<td><h3>Curso:</h3></td>
						<td id="curS" name="curS"><h3>${cursoS}</h3></td>
					</tr>
					
				</table>
				
		</div>
		
		<div align="center">
			<a href="datos.jsp"><input type="button" value="Volver al formulario"></a>		
		</div>
		
		<br>
		
		<form action="Hola" method="post"> 
	        <div align="center"> 
	 
				<input type="hidden" value="${nombreS}" name=nomB id=nomB>
				<input type="submit" value="Borrar datos">
	
			</div>
	 	</form>
 	
</body>
</html>
