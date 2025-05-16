package Collections;
import java.util.*;
public class Stack {
public static void main(String[] args) {
	Stack<Object> s=new Stack<>();
	s.push(1);
	s.push(2);
	System.out.println(s);
	s.pop();
	s.remove(0);
	System.out.println(s);
	
}
}
