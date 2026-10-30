package Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(103, "Java");
        map.put(101, "Python");
        map.put(102, "HTML");
        map.put(104, "JavaScript");
        map.put(null, "Java");
        
        map.put(105, null);
        map.put(106, "Python");
        map.put(107, null);
        map.put(null, "CSS");

        System.out.println(map);

	}

}
