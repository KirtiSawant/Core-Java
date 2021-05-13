import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		
		//addAll
		Collections.addAll(list, "element 1", "element 2", "element 3");
		System.out.println(list);
		
		//BinarySearch
		Collections.sort(list);
		int index = Collections.binarySearch(list, "three");
		System.out.println(index);
		
		//Reverse
		Collections.reverse(list);
		System.out.println(list);
		
		//shuffle
		Collections.shuffle(list);
		System.out.println(list);
		
		//sort
		Collections.sort(list);
		System.out.println(list);
		
		//min max
		List<String> source = new ArrayList<String>();
		source.add("1");
		source.add("2");
		source.add("3");
		
		String min = (String) Collections.min(source);
		System.out.println(min);
		//max
		String max = (String) Collections.max(source);
		System.out.println(max);
		
		
		
	}

}
