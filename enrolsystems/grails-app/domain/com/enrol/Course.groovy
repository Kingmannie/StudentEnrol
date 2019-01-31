package com.enrol

class Course {

	String department
	String courseTitle
	String courseLeader
	String courseCode
	Date startDate
	Date endDate
	String description
	int numberOfStudents
	double tuitionFees

    static constraints = {
	
	courseTitle nullable:false, blank:false;
	department nullable:false, blank:false;
	courseLeader nullable:false, blank:false;
	courseCode nullable:false, blank:false, maxSize:20;
	numberOfStudents nullable:false, blank:false, min:20, max:60;
	startDate nullable:false, blank:false;
	endDate nullable:false, blank:false;
	description nullable:false, blank:false, maxSize:5000, widget:'textarea'; 
	tuitionFees nullable:false, blank:false, scale:2;
    }
}
