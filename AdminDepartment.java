package com.greatlearning.services;

import com.greatlearning.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	public String departmentName()
    {
        System.out.println("Welcome to Admin Department");
	    return departmentName;	
    }
	
    public String getTodaywork()
    {
        System.out.println("Complete your documents submission");
	    return getTodaywork;
    }

    public String getWorkDeadline()
    {
        System.out.println("Complete by EOD");
        return getWorkDeadline;	
    }
}
