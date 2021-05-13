import java.util.ArrayList;
import java.util.List;

public class LastEleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<>();

		String ele1 = "ele 1";
		String ele2 = "ele 2";

		list1.add(ele1);
		list1.add(ele2);
		list1.add(ele1);

		int lastIndex = list1.lastIndexOf(ele1);
		System.out.println("lastIndex = " + lastIndex);

	}

}
