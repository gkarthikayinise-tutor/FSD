package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashSet<String> set=new HashSet<String>();  
		set.add("selvi");  
		set.add("kavi");  
		set.add("selvi");  
		set.add("mani");  
		set.add(null);
		set.add("karthi");
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  */
		
		System.out.println("\nLinked Hashset");
		//LinkedHashSet
		LinkedHashSet<String> set1=new LinkedHashSet<String>();  
		set1.add("mani");  
		set1.add(null);  
		set1.add("mani");  
		set1.add("Ajay");  
		Iterator<String> itr1=set1.iterator();  
		while(itr1.hasNext()){  
			System.out.println("....");
		System.out.println(itr1.next());  
		}  

	}

}
