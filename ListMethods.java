import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listA = new ArrayList<>();
		listA.add("element 1");
		listA.add("element 2");
		listA.add("element 3");
		System.out.println(listA);
		
		Object element = null;
		List<Object> list = new ArrayList<>();
		list.add(element);
		System.out.println(list);
		
		list.add(0, "element 4");
		System.out.println(list);
		
		
		List<String> listSource = new ArrayList<>();
		listSource.add("Aa");
		listSource.add("Bb");

		List<String> listDest   = new ArrayList<>();
		listDest.addAll(listSource);
		System.out.println(listDest);
		
		
				
	}

}
