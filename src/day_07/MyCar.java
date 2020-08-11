package day_07;

public class MyCar extends Vehicle{

	int maxSpeed;
	
	public void doUber() {
		System.out.println("After studying do Uber");
	}
	
	public static void main(String[]args) {
		// creating my car object
		MyCar myCar=new MyCar();
		//assigning car speed
		myCar.maxSpeed=120;
		//calling doUber method
		myCar.doUber();
		//assigning car model
		myCar.model="Toyota";
	   //assigning car milage
		myCar.mileague=13000;
		//assigning car year
		myCar.year=2020;
		//printing the car information
		System.out.println("Max speed : " +myCar.maxSpeed + "\nMy Car model : " +myCar.model + "\nMy car year " +
		myCar.year + "\nMy car milage :" + myCar.mileague );
		}
	
	
	}

