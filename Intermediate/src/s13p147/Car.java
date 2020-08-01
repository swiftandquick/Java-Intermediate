package s13p147;

public class Car extends Vehicle {

	private String carModel;
	
	Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	@Override
	public String toString() {
		return "Car [CarModel=" + carModel + "; VehicleId=" + this.getVehicleId() + "]";
	}
	
	public void info() {
		System.out.println("Truck model is " + getCarModel());
	}
	
}
