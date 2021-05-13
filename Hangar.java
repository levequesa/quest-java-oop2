
public class Hangar {

	public static void main(String[] args) {
		
		Car car = new Car("Suzuki", 1000);
		Boat boat = new Boat("Peugeot", 10000);
		System.out.println(car.doStuff());
		System.out.println(boat.doStuff());
	}
}