import java.util.*;
import java.util.stream.Stream;
public class MapValueIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		 map.put("100","Nita");  
		  map.put("101","Niti");  
		  map.put("102","Nilam");
		System.out.println(map);
		 map.remove("101");
		    System.out.println(map);
		    map.clear();
		    System.out.println(map);
		    int entryCount = map.size();
		    System.out.println(entryCount);
		Iterator<String> iterator = map.values().iterator();
		
		for(String value : map.values()){
		    System.out.println(value);
		    }
		
		Map<String, String> mapA = new HashMap<>();

		mapA.put("one", "first");
		mapA.put("two", "second");
		mapA.put("three", "third");

		Stream<String> stream = mapA.values().stream();
		stream.forEach((value) -> {
		    System.out.println(value);
		});
		   
		}

	}


