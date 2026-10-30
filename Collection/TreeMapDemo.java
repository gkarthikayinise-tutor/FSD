package Collection;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<>();

        map.put(103, "Java");
        map.put(101, "Python");
        map.put(102, "HTML");
        map.put(104, "JavaScript");
        map.put(105, "Java");
        map.put(106, null);
        map.put(107, "Python");
        //map.put(null, "CSS");

        System.out.println(map);

	}

}
