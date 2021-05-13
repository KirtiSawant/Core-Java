import java.util.ArrayList;
import java.util.List;

public class RetainMethodList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list      = new ArrayList<>();
		List<String> otherList = new ArrayList<>();

		String element1 = "element 1";
		String element2 = "element 2";
		String element3 = "element 3";
		String element4 = "element 4";

		list.add(element1);
		list.add(element2);
		list.add(element3);
		System.out.println(list);
		otherList.add(element1);
		otherList.add(element3);
		otherList.add(element4);
		list.retainAll(otherList);
		System.out.println(otherList);
		
		List<String> list1 = new ArrayList<>();

		list1.add("object 1");
		list1.add("object 2");

		int size = list1.size();
		System.out.println(size);

	}

}
