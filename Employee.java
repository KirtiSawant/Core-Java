
public class Employee {
	
	 protected long   employeeId;
	    protected String firstName;
	    protected String lastName;

	  public int hashCode(){
	    return (int) employeeId *
	                firstName.hashCode() *
	                lastName.hashCode();
	  }

  public static void main(String[] args) {
		
		

	}
}


