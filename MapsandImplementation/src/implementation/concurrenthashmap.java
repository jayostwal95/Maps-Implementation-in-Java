//Concrrent hashmap implementation in java by adding and removing by threads
package implementation;

import java.util.HashMap;
import java.util.concurrent.*;

public class concurrenthashmap {
	
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(100,"Hey");
		m.put(101,"World");
		m.put(102,"World");
		 // Here we cant add Hello because 101 key 
        // is already present in ConcurrentHashMap object 
        m.putIfAbsent(101, "Hello"); 
  
        // We can remove entry because 101 key 
        // is associated with For value 
        m.remove(101, "World"); 
  
        // Now we can add Hello 
        m.putIfAbsent(103, "Hello"); 
  
        // We cant replace Hello with For 
        m.replace(101, "World", "For"); 
        System.out.println(m);
	}

}
