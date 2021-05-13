
import java.util.*;

public class IteratorForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();

		list.add("one");
		list.add("two");
		list.add("three");

		for( String element : list ){
		    System.out.println( element.toString() );
		}
	}

}
