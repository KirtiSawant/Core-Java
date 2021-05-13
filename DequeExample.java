import java.util.*;
public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<>();

		deque.add("element 1");
		deque.add("element 2");
		deque.add("element 3");
		System.out.println(deque);
		deque.addLast("element 4");
		System.out.println(deque);
		deque.addFirst("element 0");
		System.out.println(deque);
		deque.offer("element 1");
		System.out.println(deque);
		deque.offerLast("element 1");
		System.out.println(deque);
		deque.offerFirst("element 1");
		System.out.println(deque);
		deque.push("element 9");
		System.out.println(deque);
		//Peek at Element in Deque
		Deque<String> deque1 = new ArrayDeque<>();
		deque1.add("first element");
		deque1.add("last element");
		String firstElement = deque1.peek();
		System.out.println(firstElement);
		
	}

}
