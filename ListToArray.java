import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list      = new ArrayList<>();

		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 3");

		Object[] objects = list.toArray();
		//System.out.println(objects);
		
		String[] values = new String[]{ "one", "two", "three" };

		List<String> list1 = (List<String>) Arrays.asList(values);
		System.out.println(list1);

	}

}
