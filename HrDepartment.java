package com.greatlearning.services;

import com.greatlearning.model.SuperDepartment;

public class HrDepartment extends SuperDepartment {

    public String departmentName()
    {
        System.out.println( "Welcome to HR Department");
  	 return departmentName; 
    }
    
    public String getTodaywork()
    {
        System.out.println("Fill today's Worksheet and mark your attendance");
	return getTodaywork;
    }
 
    public String getWorkDeadline()
    {
        System.out.println("Complete by EOD");
       	return getWorkDeadline;
    }

    public String doActivity()
    {
        System.out.println("Team Lunch");
	return doActivity;
    }
}
