<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="hello" method="post"> 
	<!--
	
	IMPORTANTE:
	El action debe coincidir con <url-pattern> </url-pattern> de web.xml
	
	-->

	
		<div align="center">
		
				<table width=350>
					<tr>
						<td colspan="2" align="center"> <h2> INSERTA TUS DATOS <hr></h2> </td>
					</tr>
					
					<tr>
						<td> <h3>Nombre:</h3></td>
						<td><input type="text" id="user" name="user" ></td>
					</tr>
					 
					<tr>
						<td><h3>Fecha de nacimiento:</h3></td>
						<td><input type="date" id="edad" name="edad"></td>
					</tr>
					 
					<tr>
						<td><h3>Curso:</h3></td>
						<td>			
							<select id="curso" name="curso"> 
								<option> 1H </option>
								<option> 2H </option>
							</select>
						</td>
					</tr>
					
					<tr>
						<td colspan="2" align="center"><input type="submit" value="Enviar"></td>
					</tr>
					
					<tr>
						<td colspan="2" align="center"><a href="tablaUsers.jsp"> TABLA USUARIOS </a></td>
					</tr>
				</table>
				
		</div>
		
	</form>
	</body>
</html>