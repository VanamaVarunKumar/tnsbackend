package com.tns.day3;
//Polymorphism
/*
class Teacher{
	void role() {
		System.out.println("I am aTeacher");
	}
}
class Student extends Teacher{
	void role(){
		System.out.println("I am a Student");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Student s=new Student();
		s.role();
			}
				}
//-------------------------------------------------------
//Different Parameters(Method overloading)
class Sum{
	public int sum(int x, int y) {
		int area=x*y;
		return area;
	}
	public int sum(int x,int y,int z) {
		int area=x*y*z;
		return area;
	}
}
public class Polymorphism{
	public static void main(String[] args) {
		Sum s=new Sum();
		System.out.println(s.sum(2, 3));
		System.out.println(s.sum(2, 5, 6));
		}
}

//---------------------------------------------------------------
//With different datatypes(method Overloading)
class Multiply{
	public int multiply(int a,int b) {
		return  a * b;
	}
	public double multiply(double a,double b) {
		return a*b;
}
	public float multiply(float a,float b,float c) {
		return a*b*c;
	}
}
public class Polymorphism{
	public static void main(String[] args) {
		Multiply m= new Multiply();
		System.out.println(m.multiply(4,5));
		System.out.println(m.multiply(35.54,22.34));
		System.out.println(m.multiply(2.3f,3.4f,4.5f));
	}
	}
*/
class Details{
	public void showdetails(String department,int code) {
		System.out.print("name"+ department +",Code"+code);
	}
	public void showdetails(int code,String department)	{
		System.out.print("Code"+code+",name"+ department );
	}}
public class Polymorphism{
	public static void main(String[] args) {
	Details d=new Details();
	d.showdetails("varun" ,22);
}
}
