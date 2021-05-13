import java.util.HashMap;
import java.util.Map;

public class MapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Map<String, String> map = new HashMap<>();
			 map.put("100","Nita");  
			  map.put("101","Niti");  
			  map.put("102","Nilam");
			System.out.println(map);
		//	map.compute("123", (key, value) -> value == null ? null : value.toString().toUpperCase());
			map.computeIfAbsent("123", (key) -> "abc");
			System.out.println(map);
			map.merge("123", "XYZ", (oldValue, newValue) -> newValue + "-abc");
			System.out.println(map);
	}

}
