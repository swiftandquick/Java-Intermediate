package s13p147;

public class Truck extends Vehicle {

	private String truckModel;
	
	Truck(int vehicleId, String truckModel) {
		super(vehicleId);
		this.truckModel = truckModel;
	}
	
	public String getTruckModel() {
		return truckModel;
	}
	
	@Override
	public String toString() {
		return "Truck [TruckModel=" + truckModel + "; VehicleId=" + this.getVehicleId() + "]";
	}

	public void info() {
		System.out.println("Truck model is " + getTruckModel());
	}
	
}
