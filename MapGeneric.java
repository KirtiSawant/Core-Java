import java.util.*;
public class MapGeneric {
	
	public static void main(String args[]){  
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Nita");  
		  map.put(101,"Niti");  
		  map.put(102,"Nilam"); 
		 
		    System.out.println( map);  
		   String value = map.get(null);
		   System.out.println (value); 
		   
		   Map<String, String> mapA = new HashMap<>();
		   mapA.put("1", "A");
		   mapA.put("2", "B");
		  // System.out.println (mapA);

		   Map<String, String> mapB = new HashMap<>();
		   mapB.putAll(mapA);
		   System.out.println (mapB);
		   String element1 = (String) mapA.get("1");
		   System.out.println (element1);
		   String value1 = mapA.getOrDefault("E", "default value");
		   System.out.println (value1);
		   boolean hasKey = mapA.containsKey("123");
		   System.out.println (hasKey);
		   boolean hasValue = mapA.containsValue("B");
		   System.out.println (hasValue);
		   
		   

}
	}

