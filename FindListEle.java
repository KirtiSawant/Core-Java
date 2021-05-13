import java.util.ArrayList;
import java.util.List;

public class FindListEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();

		String element1 = "element 1";
		String element2 = "element 2";

		list.add(element1);
		list.add(element2);

		int index1 = list.indexOf(element1);
		int index2 = list.indexOf(element2);

		System.out.println("index1 = " + index1);
		System.out.println("index2 = " + index2);
		
		//Remove
		List<String> list1 = new ArrayList<>();

		String element = "first element";
		String elemen = "second element";
		list1.add(element);
		list1.add(elemen);

		list1.remove(element);
		//list1.clear();
		System.out.println(list1);
		
	}

}
