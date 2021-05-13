import java.util.*;
public class SetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Set<String> setA = new HashSet<>();

		setA.add("element 1");
		setA.add("element 2");
		setA.add("element 3");

		Iterator<String> iterator = setA.iterator();

		while(iterator.hasNext()){
		  String element = iterator.next();
		  System.out.println(element);
		}
	}

}
