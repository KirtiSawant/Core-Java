

public class ShadowOuter {
	
	    private String text = "I am Outer private!";

	    public class Inner {

	        private String text = "I am Inner private";

	        public void printText() {
	            System.out.println(text);
	            System.out.println(ShadowOuter.this.text);
	        }
	    }
	

	public static void main(String[] args) {
		
		ShadowOuter outer = new ShadowOuter();
		ShadowOuter.Inner inner = outer.new Inner();
		inner.printText();

	}

}
