package s13p147;

public class Vehicle {

	private int VehicleId;
	
	public Vehicle(int vehicleId) {
		super();
		VehicleId = vehicleId;
	}
	
	public int getVehicleId() {
		return VehicleId;
	}
	
	@Override
	public String toString() {
		return "Vehicle [VehicleId=" + VehicleId + "]";
	}
	
	public void info() {
		System.out.println("Vehicle ID is " + getVehicleId());
	}
	
}
