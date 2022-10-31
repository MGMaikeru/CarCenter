package model;

public class ElectricCar extends Car implements IBatteryNotify {

	private double batteryCapacity;

	/**
	 * 
	 * @param id
	 * @param licensePlate
	 * @param model
	 * @param batteryCapacity
	 */
	public ElectricCar(String id, String licensePlate, String model, double batteryCapacity) {
		super(id, licensePlate,model); 
		this.batteryCapacity = batteryCapacity;

	}

	public double getBatteryCapacity() {
		return this.batteryCapacity;
	}

	/**
	 * 
	 * @param batteryCapacity
	 */
	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public void calculateBatteryLevel(double distance){
		double consumeBaterry= 2*(distance/100);
		double remainingBattery = this.batteryCapacity - consumeBaterry;
		setBatteryCapacity(remainingBattery);
	}

	@Override
	public String drive(double kilometers){
		return "The electric car has traveled: " + kilometers + "km";
	}

}
