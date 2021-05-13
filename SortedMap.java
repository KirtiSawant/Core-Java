import java.util.*;
public class SortedMap {

	public static void main(String[] args) {
		TreeMap<String,String> sortedMap = new TreeMap<String,String>();

		sortedMap.put("a", "one");
		sortedMap.put("b", "two");
		sortedMap.put("c", "three");

		Iterator iterator = sortedMap.keySet().iterator();

		while(iterator.hasNext()) {
		    String key   = (String) iterator.next();
		    System.out.println(key);
		    
		    String value = (String) sortedMap.get(key);
		    System.out.println(value);
		    
		}
	}

}
