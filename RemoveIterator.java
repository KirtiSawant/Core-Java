import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();

		list.add("123");
		list.add("456");
		list.add("789");
		System.out.println(list);
		Iterator<String> iterator = list.iterator();

		while(iterator.hasNext()) {
		    String v = iterator.next();
		    System.out.println(iterator.next());
		    
		    if(v.equals("456")){
		        iterator.remove();
		        System.out.println(v);
		        
		    }
		    
		}
	}

}
