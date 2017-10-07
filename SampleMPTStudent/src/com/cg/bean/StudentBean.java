package com.cg.bean;

public class StudentBean {

	private int studentid; 
	private String studentname;
	private String age;
	private String state;
	private String gender;
	private String numOfSubScoredCentum;
	private String noOfAttempts; 
	private String totSubScores;
	
	public StudentBean(int studentid, String studentname, String age,
			String state, String gender, String numOfSubScoredCentum,
			String noOfAttempts, String totSubScores) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.age = age;
		this.state = state;
		this.gender = gender;
		this.numOfSubScoredCentum = numOfSubScoredCentum;
		this.noOfAttempts = noOfAttempts;
		this.totSubScores = totSubScores;
	}
	
	public StudentBean(){
		
	}
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNumOfSubScoredCentum() {
		return numOfSubScoredCentum;
	}
	public void setNumOfSubScoredCentum(String numOfSubScoredCentum) {
		this.numOfSubScoredCentum = numOfSubScoredCentum;
	}
	public String getNoOfAttempts() {
		return noOfAttempts;
	}
	public void setNoOfAttempts(String noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}
	public String getTotSubScores() {
		return totSubScores;
	}
	public void setTotSubScores(String totSubScores) {
		this.totSubScores = totSubScores;
	}
	
	
}
