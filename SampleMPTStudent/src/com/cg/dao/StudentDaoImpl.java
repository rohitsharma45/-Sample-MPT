package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.DBUtil.Dbutil;
import com.cg.bean.StudentBean;





public class StudentDaoImpl implements IStudentDao {

	@Override
	public ArrayList<StudentBean> retrieveDetails() {
		Connection conn=null;
		ArrayList<StudentBean> list =new ArrayList<StudentBean>();
			try{
				conn=Dbutil.getConnection();
				String sql="Select * from Student_score";
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery(sql);
				while(rs.next())
				{
					int studId=rs.getInt(1);
					String studentName=rs.getString(2);
					String age=rs.getString(3);
					String state=rs.getString(4);
					String gender=rs.getString(5);
					String subScoredCentum=rs.getString(6);
					String noOfAttmpt=rs.getString(7);
					String totsubScores=rs.getString(8);
					list.add(new StudentBean(studId, studentName,age,state,gender,subScoredCentum,noOfAttmpt,totsubScores));
				}
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		
		
		return list;
	}

	@Override
	public int insertDetails(StudentBean bean) {
		int row=0;
		Connection conn=null;
		try{
		conn=Dbutil.getConnection();
		System.out.println(conn);
		PreparedStatement ps=conn.prepareStatement("insert into Student_score values(stud_id_seq.nextval,?,?,?,?,?,?,?)");
		ps.setString(1, bean.getStudentname());
		ps.setString(2,bean.getAge());
		ps.setString(3,bean.getState());
		ps.setString(4, bean.getGender());
		ps.setString(5, bean.getNumOfSubScoredCentum());
		ps.setString(6, bean.getNoOfAttempts());
		ps.setString(7, bean.getTotSubScores());
		row=ps.executeUpdate();
		/*PreparedStatement ps1=conn.prepareStatement("Select stud_id_seq.currval from dual");
		ResultSet rs=ps1.executeQuery();
		while(rs.next())
		{
			row=rs.getInt(1);
		}*/
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return row;
	
	}

}
