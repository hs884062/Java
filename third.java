package base;


import static java.lang.System.out;
import java.util.*;

public class third {
	public static void main(String[] args) {
		Set<Integer> st1=new TreeSet<>();
		st1.add(4);
		st1.add(40);
		st1.add(14);
		st1.add(4);
		out.println(st1);// In order
		Set<Integer> st2=new LinkedHashSet<>();
		st2.add(4);
		st2.add(40);
		st2.add(14);
		st2.add(4);
		out.println(st2); // Not in ascending order 
		Set<Integer> st3=new HashSet<>();
		st3.add(4);
		st3.add(40);
		st3.add(14);
		st3.add(4);
		out.println(st3); // Not in ascending order 
	}
}