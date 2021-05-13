import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list      = new ArrayList<>();

		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 3");
		System.out.println(list);
		//Remove All Duplicate
		Set<String> set = new HashSet<>();
		set.addAll(list);
		System.out.println(set);
	}

}
