
	public interface AutoClosable {

	    public void close() throws Exception;
	}
	public class MyAutoClosable implements AutoCloseable {

	    public void doIt() {
	        System.out.println("MyAutoClosable doing it!");
	    }

	    @Override
	    public void close() throws Exception {
	        System.out.println("MyAutoClosable closed!");
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
