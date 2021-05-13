abstract class Shape
{
	double dim1,dim2;
	Shape(double d1,double d2)
	{
		dim1=d1;
		dim2=d2;
	}
	abstract double area();
}
class Circle extends Shape
{
	Circle(double radius)
	{
		super(radius,0);//invoke constructor
	}
	double area()
	{
		return Math.PI*dim1*dim1;
	}
}
class Reactangle extends Shape
{
	Reactangle(double length,double breadth)
	{
		super(length,breadth);//shape constructor
	}
	double area()
	{
		return dim1*dim2;
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Shape	s=new Circle(2);
		System.out.println("Area of circle="+s.area());
	  s=new Reactangle(10,20);
		System.out.println("Area of Reactangle="+s.area());
		

	}

}
