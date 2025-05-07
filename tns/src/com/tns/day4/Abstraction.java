package com.tns.day4;/*
abstract class Animal {
 abstract void makeSound();
 void sleep() {
     System.out.println("Sleeping...");
 }
}
class Dog extends Animal {
 void makeSound() {
     System.out.println("Dog barks");
 }
}
class Cat extends Animal {
 void makeSound() {
     System.out.println("Cat meows");
 }
}
public class Abstraction {
 public static void main(String[] args) {
 //upcasting
     Dog a1 = new Dog(); // 
     Animal a2 = new Cat();
     a1.makeSound();
     a2.makeSound(); 
     a1.sleep();     
     a2.sleep();     
 }
}
*/
package com.tns.day4;

abstract class Shape{
	 abstract void draw();	
}
class size extends Shape{
	 void draw() {
		 System.out.println("draw1");
	 }
}
class shape extends Shape{
	 void draw() {
		 System.out.println("draw");
	 }
}
public class Abstraction{
	 public static void main(String[] args) {
	//Shape v=new shape();
	 Shape s=new size();
	 s.draw();
}
}
