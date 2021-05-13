import java.util.*;
public class SetToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();
		set.add("123");
		set.add("456");

		List<String> list = new ArrayList<>();
		list.addAll(set);
		System.out.println(list);
	}

}
