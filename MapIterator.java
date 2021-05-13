import java.util.*;
public class MapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		 map.put("100","Nita");  
		  map.put("101","Niti");  
		  map.put("102","Nilam"); 
		 
		Iterator<String> iterator = map.keySet().iterator();

		while(iterator.hasNext()){
		  String key   = iterator.next();
		  String value = map.get(key);
		  System.out.println(value);
		  
		  
		}

	}

}
