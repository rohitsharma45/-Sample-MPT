package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.StudentBean;

public interface IStudentService {

	ArrayList<StudentBean> retrieveDetails();

	int insertDetails(StudentBean bean);
	


}
