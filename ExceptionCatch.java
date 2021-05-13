import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionCatch {

	

	public static void openFile(){
        try {
            // constructor may throw FileNotFoundException
            FileReader reader = new FileReader("someFile");
            int i=0;
            while(i != -1){
                //reader.read() may throw IOException
                i = reader.read();
                System.out.println((char) i );
            }
            reader.close();
            System.out.println("--- File End ---");
        } catch (FileNotFoundException e) {
            //do something clever with the exception
        	System.out.println("--- File  ---");
        } catch (IOException e) {
            //do something clever with the exception
        	System.out.println("--- File Read ---");
        }
    }
public static void main(String[] args) {
	
	
	// TODO Auto-generated method stub
	openFile();
}
}
