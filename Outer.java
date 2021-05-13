
	public class Outer {

	    private String text = "I am private!";

	    public class Inner {

	        public void printText() {
	            System.out.println(text);
	        }
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.printText();

	}

}
