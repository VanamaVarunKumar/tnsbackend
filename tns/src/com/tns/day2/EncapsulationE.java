package com.tns.day2;
/*
public class EncapsulationE {
	private String name;
	private int age ;
	private int roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public static void main(String[] args) {
		EncapsulationE e=new EncapsulationE();
		e.setAge(15);
		e.setName("Meghana");
		e.setRoll(10);
		System.out.println(e.getAge());
		System.out.println(e.getName());
		System.out.println(e.getRoll());
	}
	
}
public class EncapsulationE{
	private long accNo;
    private String name;
    private String email;
    float amount=65;
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    public static void main(String[] args) {
		EncapsulationE e=new EncapsulationE();
		e.setAccNo(200408449);
		e.setEmail("ac234gmail.com");
		e.setName("varun");
		System.out.println(e.getAccNo());
		System.out.println(e.getEmail());
		System.out.println(e.getName());
		System.out.println(e.amount);
		
	}
}	
import java.util.Scanner;
public class EncapsulationE {
	private int accno1;
	private int amount1;
	public void readInput() {
	Scanner sc=new Scanner(System.in);
		 accno1=sc.nextInt();
		 amount1=sc.nextInt();
}
		public void print() {
			System.out.println(accno1);
		}
		public void print1() {
			System.out.println(amount1);
			
		}
		public static void main(String[] args) {
			EncapsulationE e=new EncapsulationE();
			e.readInput();
			e.print();
			e.print1();
			
		}
}
//Encapsulation with constructor
public class EncapsulationE{
	private int length;
	private int breadth;
	EncapsulationE(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void area() {
		int area = length*breadth;
	System.out.println(area);
	}
	public static void main(String[] args)
	{
	
	EncapsulationE E=new EncapsulationE(5,6);
	E.area();
	}
	}

public class EncapsulationE{
	private int id;
	private String name;
	public int getid() {
		return id;
		
	}
	public void setid(int id) {
		this.id=id;
		System.out.println(id);
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
		System.out.println(name);
	}
	public static void main(String[] args) {
	EncapsulationE e=new EncapsulationE(); 
		e.setid(10);
		e.setname("varun");
		e.setname("varunkumar");
		
		
}
}
*/