package com.cg.dao;

import java.util.ArrayList;

import com.cg.bean.StudentBean;

public interface IStudentDao {

	ArrayList<StudentBean> retrieveDetails();

	int insertDetails(StudentBean bean);

}
