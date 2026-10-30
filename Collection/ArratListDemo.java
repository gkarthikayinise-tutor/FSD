package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArratListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Karthi");
		
		
		list.add("Avanthi");
		list.add("Mirthi");
		list.add("Selvi");
		list.add("Sumathi");
		list.add(null);
		
		System.out.print("List value:\n");
		System.out.print(list);
		
		Iterator datas=list.iterator();
		
		System.out.print("List value using Iterator:\n");
		while(datas.hasNext()){
			System.out.println(datas.next());
		}
		
		System.out.print("List value using ListIterator:\n");
		
		ListIterator<String>list2=list.listIterator(list.size());
		
		while(list2.hasPrevious()){
			String str=list2.previous();
			System.out.println(str);
		}
		
		
		  System.out.println("Traversing list through for loop:");  
          for(int i=0;i<list.size();i++)  
          {  
           System.out.println(list.get(i));     
          }  

          System.out.println("Traversing list through forEach() method:");  
          //The forEach() method is a new feature, introduced in Java 8.  
              list.forEach(a->{ //Here, we are using lambda expression  
                  System.out.println(a);  
                });  
                  

              System.out.println("Traversing list through forEachRemaining() method:");  
                Iterator<String> itr=list.iterator();  
                itr.forEachRemaining(a -> {//Here, we are using lambda expression    
              System.out.println(a);  
                });

          
		ArrayList list1=new ArrayList();
		list1.add(1000);
		list1.add("Karthi");
		list1.add(1000.45);
		list1.add(true);
		System.out.print(list1);
		System.out.println("After invoking add(E e) method: "+list1);  
        //Adding an element at the specific position  
		list1.add(1, "kavi"); 
		list1.addAll(list);
		

	}

}
