

	import java.util.HashSet;
import java.util.Set;

	public class SetExample {

	    public static void main(String[] args) {

	        Set<String> setA = new HashSet<String>();
	        String element="hello";
	        setA.add(element);

	        System.out.println( setA.contains(element) );
	    }
	}


