package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lists {
    public static void main(String[] args) {
    	//Array List
        List<Object> l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add("Varun");
  for(Object i:l) {
	  System.out.println(i);
  }
  //Linked List
	  List<Object> L = new LinkedList();
      L.add(10);
      L.add(20);
      L.add("Varun");
      for (Object j:L) {
    	  System.out.println(j);
      }
      //Vector List
      List<Object> V = new Vector();
      V.add(10);
      V.add(20);
      V.add("Varun");
      for (Object k:V) {
    	  System.out.println(k);
}
    }
}