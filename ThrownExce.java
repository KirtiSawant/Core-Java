import java.util.EmptyStackException;

public class ThrownExce {

	public static Object pop() {
	    Object obj;

	    int size;
		if (size == 0) {
	        throw new EmptyStackException();
	    }

	    obj = objectAt(size - 1);
	    setObjectAt(size - 1, null);
	    size--;
	    return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 pop();
	}

}
