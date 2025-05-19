package com.tns.assignment;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeApi {
	public static void main(String[] args) {
LocalDate D=LocalDate.now()	;//Today's Date	
System.out.println("Today's Date:"+D);
LocalDate d=LocalDate.of(1955,4,20);//Custom Date
System.out.println("Date:"+d);
LocalTime T=LocalTime.now();
System.out.println("Present Time"+T);
LocalTime t=LocalTime.of(5,50);
System.out.println("Time"+t);
}
}