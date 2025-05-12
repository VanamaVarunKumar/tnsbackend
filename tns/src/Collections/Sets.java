package Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Sets {
public static void main(String[] args) {
	//HashSet(While printing no insertion order is followed)
	Set<Object> s=new HashSet<>();
	s.add(10);
	s.add(30);
	s.add(20);
	for(Object i:s) {
		System.out.println(i);
	}
	//LinkedSet(While printing  insertion order is followed)
	Set<Object> L=new LinkedHashSet<>();
	L.add(30);
		L.add(10);
		L.add(20);
		for(Object j:L) {
			System.out.println(j);
	//TreeSet(While printing elements will be sorted)
			Set<Object> T=new TreeSet<>();
			T.add(30);
				T.add(10);
				T.add(20);
				for(Object k:T) {
					System.out.println(k);
	}
		}		
}
}