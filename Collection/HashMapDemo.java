/*
 * 1. put() method
- Inserts a new key-value pair into the HashMap.
- If the key already exists, it replaces the old value with the new value.
- Returns the previous value if the key exists; otherwise, returns null.
Example:
map.put(1, "Java");
map.put(2, "Python");

map.put(1, "JavaScript");//replace java to javascript
 * 2. putIfAbsent() method
- Inserts a key-value pair only if the key does not exist or its current value is null.
- If the key already contains a non-null value, it does not replace the existing value.
- Returns the previous value if present; otherwise, returns null.

*Example
*map.put(1, "Java");
 map.put(2, "Python");

 map.putIfAbsent(1, "JavaScript"); //not repalce allowed
 map.putIfAbsent(3, "HTML"); //insert the new one*/
package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();          
		      map.put(100,"Avanthi");    
			  map.put(101,"Mirthi");    
			  map.put(102,"Ram");  
			  map.put(103, "Guru");
			  
			  map.putIfAbsent(101, "Avanthika");
			  map.putIfAbsent(104, "Sumathi");
			  System.out.println("Iterating Hashmap...");  
			  for(Map.Entry m : map.entrySet()){    
			  	    System.out.println(m.getKey()+" "+m.getValue());    
			  	   }  
			  HashMap<Integer,String> map1=new HashMap<Integer,String>();  
			        map1.put(105,"Ravi");  
			      map1.putAll(map);
			      
			      System.out.println("Iterating Hashmap...");  
				  for(Map.Entry m : map1.entrySet()){    
				  	    System.out.println(m.getKey()+" "+m.getValue());    
				  	   }
			    System.out.println("Initial list of elements: "+map);  
			    //key-based removal  
			    map.remove(100);  
			    System.out.println("Updated list of elements: "+map);  
			    //value-based removal  
			    map.remove(101);  
			    System.out.println("Updated list of elements: "+map);  
			    //key-value pair based removal  
		    map.remove(102, "Rahul");  
			    System.out.println("Updated list of elements: "+map);  


	}

}
