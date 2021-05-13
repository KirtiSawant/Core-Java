import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		Iterator<String> iterator = list.iterator();
		        
		iterator.forEachRemaining((element) -> {
			System.out.println(element);
		});

	}

}
