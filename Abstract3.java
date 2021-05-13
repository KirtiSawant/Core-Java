
 abstract class MyAbstractClass {

     abstract void abstractMethod();
    }


 class MySubClass extends MyAbstractClass {

    public void abstractMethod() {
        System.out.println("My method implementation");
    }
}

class Abstract3
{
 public static void main(String args[])
 {
	MySubClass b=new MySubClass();
	b.abstractMethod();
} 
}