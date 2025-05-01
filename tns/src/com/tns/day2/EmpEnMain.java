package com.tns.day2;
//Main class for EmployeeEN
public class EmpEnMain {
	public static void main(String[] args) {
		{
			EmployeeEn en=new EmployeeEn();
			en.setEid(102);
			int num=en.getEid();
			System.out.println(num);
			en.setEname("varun");
			System.out.println(en.getEname());
			}
	}

}
