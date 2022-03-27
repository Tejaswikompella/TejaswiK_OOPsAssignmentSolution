package com.greatlearning.services;

import com.greatlearning.model.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	public String departmentName()
	{
	    System.out.println("Welcome to Tech Department");
	    return departmentName;
	}
	
	public String getTodaywork()
        {
 	    System.out.println("Complete coding by module 1");
	    return getTodaywork;
	}
	
	public String getWorkDeadline()
	{
            System.out.println("Complete by EOD");
	    return getWorkDeadline;
	}
        
	public String getTechStackInformation()
	{
	    System.out.println("Core Java");
	    return getTechStackInformation;
	}
}
