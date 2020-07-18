//Java program to sort and merge hash map in ascending order by keys
package implementation;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class sortinglinkedhash {
	public static void main(String[] args) {
		LinkedHashMap<String, String> Linkmap = new LinkedHashMap<String, String>();
		//Putting values
		Linkmap.put("Jay","Raju");
		Linkmap.put("Abhinav","Shivangi");
		Linkmap.put("Mohan","Babloo");
		Linkmap.put("Bhagat","Aarti");
		Linkmap.put("Chetan","Dhiraj");
		
		System.out.println("Before Sorting : \n");
		
		//getting keyset
		Set<String> set = Linkmap.keySet();
	
		//setting iterator
		Iterator<String> itr = set.iterator();
		
		  // iterating in Insertion-order
        while(itr.hasNext()) {
            String key = itr.next();
            System.out.println("Key : "  + key 
                    + "\t\t" + "Value : "  + Linkmap.get(key));
        }
 
        // After Sorting : Ascending order
        System.out.println("\n\n\nAfter Sorting : Ascending-Order\n");
 
        // convert to TreeMap
        Map<String, String> ts = new TreeMap<String, String>(Linkmap);
 
        // iterate acc to ascending order of keys
        for(String strKey : ts.keySet()){
            System.out.println("Key : "  + strKey 
                    + "\t\t" + "Value : "  + Linkmap.get(strKey));
        }
		
	}

}
