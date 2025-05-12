package com.tns.day5;

public interface Vechile {
	 void start();
	  void stop();
}
class Car implements Vechile{
	public void start() {
		System.out.println("Car is started");
	}

	@Override
	public void stop() {
	
		System.out.println("Car Stopped");
	}
}
class Bike implements Vechile{
	public void start() {
		System.out.println("Bike is started");
	}
	public void stop() {
		System.out.println("Bike is stopped");
	}
}
