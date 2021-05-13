import java.util.*;
public class MapEntryIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		 map.put("100","Nita");  
		  map.put("101","Niti");  
		  map.put("102","Nilam");
		  System.out.println(map);
		Set<Map.Entry<String, String>> entries = map.entrySet();
		Iterator<Map.Entry<String, String>> iterator =  entries.iterator();
	   
         /*
		while(iterator.hasNext()) {
		    Map.Entry<String, String> entry = iterator.next();
		    String key   = entry.getKey();
		    String value = entry.getValue();
		    }*/
		for(Map.Entry<String, String> entry : map.entrySet()){
		    String key = entry.getKey();
		    String value = entry.getValue();
		
		    System.out.println(key);
		    System.out.println(value);
		    
		   
		    
		}

	}

}
