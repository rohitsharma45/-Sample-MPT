package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.StudentBean;
import com.cg.dao.IStudentDao;
import com.cg.dao.StudentDaoImpl;


public class StudentServiceImpl implements IStudentService {

	IStudentDao dao=new StudentDaoImpl();
	
	public ArrayList<StudentBean> retrieveDetails() {
		
		return dao.retrieveDetails();
	}

	public int insertDetails(StudentBean bean) {
		
		return dao.insertDetails(bean);
	}

}
