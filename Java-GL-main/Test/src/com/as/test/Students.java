package com.as.test;

public class Students {
	private int studentId;
	private String studentFName;
	private String studentLName;

	public Students(int studentId, String studentFName, String studentLName) {
		super();
		this.studentId = studentId;
		this.studentFName = studentFName;
		this.studentLName = studentLName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFName=" + studentFName + ", studentLName=" + studentLName
				+ "]";
	}

}
