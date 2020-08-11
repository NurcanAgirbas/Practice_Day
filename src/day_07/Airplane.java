package day_07;

public class Airplane implements FlyingObjects,ObjectsWithEngine {

	@Override
	public void fly() {
		System.out.println("Airplane can fly");
		
	}

	@Override
	public void horsePower() {
		System.out.println("HorsePower so hard");
		
	}

}
