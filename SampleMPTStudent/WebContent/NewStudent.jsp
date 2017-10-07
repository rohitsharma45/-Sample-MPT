<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="cust.css" />
</head>
<body>
<form action="details.obj">
<table>
<tr><td>StudentName</td><td><input type="text" name="txtName" required></td></tr>
<tr><td>Age</td><td><input type="text" name="txtAge" required></td></tr>
<tr><td>State</td>
<td>
	<input type="text" id="txtState" name="txtState" required  maxlength="20" list="Statelist"/>
		<datalist id="Statelist">
		<option value="TamilNadu">TamilNadu</option>
		<option value="Karnataka">Karnataka</option>
		<option value="Pune">Pune</option>
		<option value="Mumbai">Mumbai</option>
	</datalist>
</td></tr>
<tr><td>Gender</td><td class="txt"><input type="text" name="txtGender" required></td></tr>
<tr><td>No of Subjects scored Centum</td><td class="txt"><input type="text" name="txtCentum" required></td></tr>
<tr><td>No Of attempts</td><td class="txt"><input type="text" name="txtAttmpt" required></td></tr>
<tr><td>Total subject Scores</td><td class="txt"><input type="text" name="txttot" required></td></tr>
<tr><td><input  class="btn" type="submit" value="SubmitDetails"></td></tr>
</table>
</form>
</body>
</html>