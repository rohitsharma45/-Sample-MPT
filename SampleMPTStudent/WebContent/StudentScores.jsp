<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
     import="java.util.ArrayList, com.cg.bean.StudentBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link rel="stylesheet" href="cust.css" />
</head>
<body>
<form>
<table>
<%ArrayList<StudentBean> myList=(ArrayList<StudentBean>)session.getAttribute("list"); %>
<%for(StudentBean c:myList){
out.print(c.getStudentid());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getStudentname());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getAge());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getState());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getGender());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getNumOfSubScoredCentum());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getNoOfAttempts());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getTotSubScores());
out.print("<br/>");
}	
%>
</table>
</form>
<a href="addDetails.obj" class="a">AddNewScoreDetails</a>
</body>
</html>