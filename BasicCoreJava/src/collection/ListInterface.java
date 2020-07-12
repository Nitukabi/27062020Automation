package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		
		List<String> list = new Vector<>();
		list.add("puja");
		list.add("Akhlesh");
		list.add("nitu");
		list.add("puja");
		
		
 for(String s:list)
 { 
	System.out.println(s);}

}
}