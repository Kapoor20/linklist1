

import java.util.*;
import java.util.zip.ZipEntry;
public class test1 {
	
	public static void main(String[] args) {
		
		int freq=1;
		
		LinkedList<String> ll= new LinkedList<String>();
		
		Set<String> set1=new HashSet<String>();
		set1.add("ankit");
		set1.add("kapoor");
		set1.add("ankit");
		
		
		
		HashMap<String,Integer> map=  new HashMap<String,Integer>();
		
		ll.add("ank");
		ll.addFirst("bun");
		System.out.println(ll);
		
		System.out.println(ll.contains("bun"));
	Iterator ia=ll.iterator();
		for(String s: ll){
			System.out.println(ia.next());
			
		
			
			
			
			
			
		}
	}
}
	


