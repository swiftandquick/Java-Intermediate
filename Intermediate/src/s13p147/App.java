package s13p147;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// List<Object> list = new ArrayList<>();
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(14, "A14"));
		list.add(new Car(15, "A15"));
		list.add(new Car(16, "A16"));
		list.add(new Truck(17, "A17"));
		list.add(new Truck(18, "A18"));
		// list.add(new String("Truck [TruckModel=B17]"));
		display(list);
		System.out.println();
		display2(list);
	}
	
	
	/* It's a static method because main method is static.  List<?> accepts 
	 * all types.  Object includes all object types.  List<? extends Vehicle> 
	 * means only accept objects of Vehicle class and Vehicle's subclasses.  
	 * This is considered upper bound.  */
	public static void display(List<? extends Vehicle> list) {
		for(Vehicle element : list) {
			System.out.println(element);
			element.info();
		}
	}
	
	
	/* Lists every object of Truck class of Truck's superclasses.  This is 
	 * considered lower bound.  */
	public static void display2(List<? super Truck> list) {
		for(Object element : list) {
			System.out.println(element);
			((Vehicle) element).info();
		}
	}
	
}
