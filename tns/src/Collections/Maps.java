package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class Maps {
	public static void main(String[] args) {
		//Hashmap Randomway
		Map<String,Integer> h=new HashMap<>();
		h.put("varun" ,12);
		h.put("Tharun" ,12);
		h.put("Abc" ,12);
		h.put("sam" ,12);
		h.put("raju" ,12);
		System.out.println(h);
		//InsertionOrder
		Map<String,Integer> l=new LinkedHashMap<>();
		l.put("varun" ,12);
		l.put("Tharun" ,12);
		l.put("Abc" ,12);
		l.put("sam" ,12);
		l.put("raju" ,12);
		System.out.println(l);
		//Key values will be printed in sorted order
		Map<String,Integer> t=new TreeMap<>();
		t.put("varun" ,12);
		t.put("Tharun" ,10);
		t.put("Abc" ,9);
		t.put("sam" ,7);
		t.put("raju" ,8);
		System.out.println(t);
		System.out.println(t.get("varun"));
	}
	}

