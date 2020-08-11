package day_07;

public class Contractor  extends Employee{

	@Override
	public void eat() {
		System.out.println("Eating veggy");
		
	}

	@Override
	public void drink() {
		System.out.println("No free drink");
	}

	@Override
	public void test() {
		System.out.println("Coming from Employee");
		
	}

}
