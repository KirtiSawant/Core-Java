//Iterating the Keys of a Java Map
import java.util.*;
import java.util.stream.Stream;
public class MapForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		 map.put("100","Nita");  
		  map.put("101","Niti");  
		  map.put("102","Nilam");
		for(String key : map.keySet()) {
		    String value = map.get(key);
		    System.out.println(value);
		}
		
		Map<String, String> mapA = new HashMap<>();

		mapA.put("one", "first");
		mapA.put("two", "second");
		mapA.put("three", "third");

		Stream<String> stream = mapA.keySet().stream();
		stream.forEach((value) -> {
		    System.out.println(value);
		});    

	}

}
