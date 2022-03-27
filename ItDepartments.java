package com.greatlearning.main;

import com.greatlearning.model.SuperDepartment;
import com.greatlearning.services.AdminDepartment;
import com.greatlearning.services.HrDepartment;
import com.greatlearning.services.TechDepartment;

public class ItDepartments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperDepartment sd = new SuperDepartment();
		sd.departmentName();
		sd.getTodaywork();
		sd.getWorkDeadline();
		sd.isTodayAHoliday();
		System.out.println(" ");
		

		AdminDepartment ad = new AdminDepartment();
		ad.departmentName();
		ad.getTodaywork();
		ad.getWorkDeadline();
		ad.isTodayAHoliday();
		System.out.println(" ");
		
		HrDepartment hd = new HrDepartment();
		hd.departmentName();
		hd.getTodaywork();
		hd.getWorkDeadline();
		hd.doActivity();
		hd.isTodayAHoliday();
		System.out.println(" ");
		
		TechDepartment td = new TechDepartment();
		td.departmentName();
		td.getTodaywork();
		td.getWorkDeadline();
		td.getTechStackInformation();
		td.isTodayAHoliday();
				
 	}
}
