import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Car {

	

		    public String brand;
		    public String numberPlate;
		    public int noOfDoors;

		    public Car(String brand, String numberPlate, int noOfDoors) {
		        this.brand = brand;
		        this.numberPlate = numberPlate;
		        this.noOfDoors = noOfDoors;
		    }
		
		    List<Car> list = new ArrayList<>();

		    list.add(new Car("Volvo V40" , "XYZ 201845", 5));
		    list.add(new Car("Citroen C1", "ABC 164521", 4));
		    list.add(new Car("Dodge Ram" , "KLM 845990", 2));

		    Comparator<Car> carBrandComparator = new Comparator<Car>() {
		        @Override
		        public int compare(Car car1, Car car2) {
		            return car1.brand.compareTo(car2.brand);
		        }
		    };
	public static void main(String[] args) {
		// TODO Auto-generated method stub

}
}