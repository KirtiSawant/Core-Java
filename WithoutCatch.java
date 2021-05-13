import java.io.FileReader;
import java.io.IOException;

public class WithoutCatch {
	 public static void openFile() throws IOException {
	        FileReader reader = null;
	        try {
	            reader = new FileReader("someFile");
	            int i=0;
	            while(i != -1){
	                i = reader.read();
	                System.out.println((char) i );
	            }
	        } finally {
	            if(reader != null){
	                try {
	                    reader.close();
	                } catch (IOException e) {
	                    //do something clever with the exception
	                }
	            }
	            System.out.println("--- File End ---");
	        }
	    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 openFile();
	}

}
