package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		// static polymorphism -- compile time polymorphism
		BMW b = new BMW();
		b.start(); // BMW-- start
		b.stop(); //car-- stop
		b.refuel();// car-- refuel
		b.theftSafety();// BMW-- theftSafety
		b.engine();// Vehicle-- engine
		
		System.out.println("*******");
		
		Car c = new Car();
		c.start();// car--start
		c.stop();// car--stop
		c.refuel();//car--refuel
		c.engine();// vehicle-- engine
		
		System.out.println("******");
		
		// child class object can be referred by parent class reference variable,
		// its called - Dynamic polymorphism -- Run time polymorphism
		// also called Top casting
		
		Car c1= new BMW();
		
		c1.start(); // BMW-- start ( overridden method will be called)
		c1.stop();// car-- stop
		c1.refuel();// car-- refuel
		
		//Down Casting
		BMW b1= (BMW)new Car(); // ClassCastException

	}

}
