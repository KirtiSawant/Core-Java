import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModificationIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();

		list.add("123");
		list.add("456");
		list.add("789");
		 System.out.println(list);
		Iterator<String> iterator = list.iterator();

		while(iterator.hasNext()) {
		    String value = iterator.next();
		    System.out.println(iterator.hasNext());
		    if(value.equals("456")){
		        list.add("999");
		        
		        System.out.println(list);
		        System.out.println(iterator.hasNext());
		    }
		    
		}

	}

}
