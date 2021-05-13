import java.util.*;
public class QueueGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new LinkedList<>();

		queue.add("element 1");
		System.out.println(queue);
		queue.offer("element 2");
		System.out.println(queue);
		int size = queue.size();
		System.out.println(size);
		
		}
	}


