import java.util.*;
public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		list.add("123");
		list.add("124");
		boolean contains123 = list.contains("123");
		System.out.print(contains123);
		
		boolean removed = list.remove("123");
		System.out.print(removed);
		System.out.println(list);
	}

}
