package com.greatlearning.model;

public class SuperDepartment {
	protected String departmentName;
	protected String getTodaywork;
	protected String getWorkDeadline;
	protected String isTodayAHoliday;
	protected String doActivity;
	protected String getTechStackInformation;

	
	public String departmentName()
	{
	    System.out.println("Welcome to SuperDepartment");
	    return departmentName;
	}

	public String getTodaywork()
	{
	    System.out.println("No Work as of now");
	    return getTodaywork;
	}
	
        public String getWorkDeadline()
	{
	    System.out.println("Nill");
	    return getWorkDeadline;
	}
	
	public String isTodayAHoliday()
	{
  	    System.out.println("Today is not a Holiday");
	    return isTodayAHoliday;
	}
}
