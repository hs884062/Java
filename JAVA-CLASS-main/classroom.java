abstract class vehicle{
	abstract void start();
	abstract void brake();

}
class Car extends vehicle{
	void start(){
		System.out.println("car:starts");
	}
		void brake(){
		System.out.println("car:apply break");
	}
	
}
class Bike extends vehicle{
	void start(){
		System.out.println("bike:starts");
	}
		void brake(){
		System.out.println("bike:apply break");
	}
	
}
public class classroom {
	
	public static void main (String[] args) {
		vehicle v1=new Car();
		vehicle v2=new Bike();
		v1.start();
		v1.brake();
		v2.start();
		v2.brake();
	}
}
