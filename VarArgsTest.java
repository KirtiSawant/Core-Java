class VarArgs
{
	void displayGreeting(String message, String...name)
	{
		for(String oneName : name)
			System.out.println(message + oneName);
	}
}
public class VarArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			VarArgs obj=new VarArgs();
			obj.displayGreeting("Hello" , "Me");
			obj.displayGreeting("Welcome" , "ME", "You", "All");
		}

	}

}
