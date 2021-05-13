
 class MySuperClass {

    public void doTheThing() {
        System.out.println("Do the thing");
    }
}

 class MySubClas extends MySuperClass{

    @Override
    public void doTheThing() {
        System.out.println("Do it differently");
    }
 }
 class Annotation1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySubClas m=new MySubClas();
		m.doTheThing();
	}

	}
