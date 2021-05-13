import java.util.*;
import java.util.stream.Stream;
public class SetStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();

		set.add("one");
		set.add("two");
		set.add("three");

		Stream<String> stream = set.stream();

		stream.forEach((element) -> { System.out.println(element); });
		
	}

}
