package com.cg.Servlet.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.StudentBean;
import com.cg.service.IStudentService;
import com.cg.service.StudentServiceImpl;


@WebServlet("*.obj")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String target=null;
		HttpSession session=request.getSession();
		StudentBean bean=new StudentBean();
		IStudentService service=new StudentServiceImpl();
		String path=request.getServletPath();
		System.out.println(path);
		
		switch(path){
			
		case "/addDetails.obj":
			target="NewStudent.jsp";
			RequestDispatcher rd=request.getRequestDispatcher(target);
			rd.forward(request, response);
			break;
		
		case "/details.obj":
			String studentName=request.getParameter("txtName");
			String age=request.getParameter("txtAge");
			String state=request.getParameter("txtState");
			String gender=request.getParameter("txtGender");
			String numOfSubScoredCentum=request.getParameter("txtCentum");
			String noOfAttempts=request.getParameter("txtAttmpt");
			String totSubScores=request.getParameter("txttot");
			bean.setStudentname(studentName);
			bean.setAge(age);
			bean.setState(state);
			bean.setGender(gender);
			bean.setNumOfSubScoredCentum(numOfSubScoredCentum);
			bean.setNoOfAttempts(noOfAttempts);
			bean.setTotSubScores(totSubScores);
	
			int res=service.insertDetails(bean);
			System.out.println(res);
			if(res==1){
				target="InsertSuccess.jsp";
			}
			else{
				System.out.println("Error!!");
			}
			break;
		
			case "/retrieve.obj":
				ArrayList<StudentBean> list = service.retrieveDetails();
				session.setAttribute("list", list);
				target="StudentScores.jsp";
				break;
				
		}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request,response);
	}


}
