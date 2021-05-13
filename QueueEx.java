import java.util.*;
public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new LinkedList<>();

		queue.add("element 0");
		queue.add("element 1");
		queue.add("element 2");

		//access via Iterator
		String removedElement = queue.remove();
		System.out.println(removedElement);

}
}
