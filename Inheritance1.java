 class Animal1 {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

 class Cat1 extends Animal1 {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
 }
public class Inheritance1 {
	 public static void main(String[] args) {
	        Cat1 myCat = new Cat1();
	        Animal1 myAnimal = myCat;
	        Animal1.testClassMethod();
	        myAnimal.testInstanceMethod();
	    }

}
