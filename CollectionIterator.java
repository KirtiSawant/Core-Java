import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		//list.add("two");
		list.add("three");
		list.add("four");
		 list.remove("three");
		Iterator<String> iterator = list.iterator();
		System.out.println(list);
		
	/*	List list1 = new ArrayList();

		list1.add("123");
		list1.add("456");
		list1.add("789");

		Iterator iterator3 = list1.iterator();
		System.out.println(list1); */
		
		Set<String> set = new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");

		Iterator<String> iterator2 = set.iterator();
		System.out.println(set);
		
		

		while(iterator.hasNext())
		{
		    Object nextObject = iterator.next();
		  
		    System.out.println(iterator.hasNext());
		    System.out.println(nextObject);
		}
	}

	private static void remove(String string) {
		// TODO Auto-generated method stub
		
	}

}
