import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	 public static void main(String[] args) {
	        List<String> list = new ArrayList();

	        list.add("one");
	        list.add("two");
	        list.add("three");

	        ListIterator<String> iterator = new ListIterator<>(list);
	        while(iterator.hasNext()) {
	            System.out.println( iterator.next() );
	        }

	    }
}
