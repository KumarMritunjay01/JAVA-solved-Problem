
 
 
// import java.io.*;

// interface Vehicle{
// 	 void changeGaer(int a);
// 	 void speedUp(int a);
// 	 void applyBreak(int a);
// }

// class Bicycle implements Vehicle {
// 	int speed = 20;
// 	int gear;

// 	@Override
// 	public void changeGaer(int newGear){
// 	gear = newGear;
// 	}

// 	@Override
// 	public void speedUp(int increment){
// 	speed = speed +increment;
// 	}

// 	@Override
// 	public void applyBreak(int decrement){
// 	speed = speed -decrement;
// 	}

// 	void printState(){
// 	System.out.println("Gear: " +gear +" " +"Speed: " +speed);
// }

// }

// class Bike implements Vehicle {
// 	int speed = 20;
// 	int gear;

// 	@Override
// 	public void changeGaer(int newGear){
// 	gear = newGear;
// 	}

// 	@Override
// 	public void speedUp(int increment){
// 	speed = speed +increment;
// 	}

// 	@Override
// 	public void applyBreak(int decrement){
// 	speed = speed -decrement;
// 	}

// 	void printState(){
// 	System.out.println("Gear: " +gear +" " +"Speed: " +speed);
// }

// }

// class Car implements Vehicle {
// 	int speed = 20;
// 	int gear;

// 	@Override
// 	public void changeGaer(int newGear){
// 	gear = newGear;
// 	}

// 	@Override
// 	public void speedUp(int increment){
// 	speed = speed +increment;
// 	}

// 	@Override
// 	public void applyBreak(int decrement){
// 	speed = speed -decrement;
// 	}

// 	void printState(){
// 	System.out.println("Gear: " +gear +" " +"Speed: " +speed);
// }

// }

// public class InterfaceAssign{
// 	public static void main(String args[]){
	
// 	Bicycle bicycle = new Bicycle();
// 	bicycle.changeGaer(3);
// 	bicycle.speedUp(50);
// 	bicycle.applyBreak(10);
	
// 	System.out.println("Present state of Bicycle is: ");
// 	bicycle.printState();

// 	Bike bike = new Bike();
// 	bike.changeGaer(3);
// 	bike.speedUp(50);
// 	bike.applyBreak(10);
	
// 	System.out.println("Present state of Bike is: ");
// 	bike.printState();

// 	Car car = new Car();
// 	car.changeGaer(3);
// 	car.speedUp(50);
// 	car.applyBreak(10);
	
// 	System.out.println("Present state of car is: ");
// 	car.printState();
// 	}
// }


/*
Design and develop a context for given case study and implement an interface for Vehicles Consider
the example of vehicles like bicycle, car and bike. All Vehicles have common functionalities such as
Gear Change, Speed up and apply breaks. Make an interface and put all these common
functionalities. Bicycle, Bike, Car classes should be implemented for all these functionalities in their
own class in their own way.
*/

/*
Design and develop a context for given case study and implement an interface for Vehicles Consider
the example of vehicles like bicycle, car and bike. All Vehicles have common functionalities such as
Gear Change, Speed up and apply breaks. Make an interface and put all these common
functionalities. Bicycle, Bike, Car classes should be implemented for all these functionalities in their
own class in their own way.
*/
import java.io.*;

interface Vehicle{
	void gearchange(int a);  // abstract method:
	void speedUp(int a);
	void applyBreaks(int a);
}

class Bicycle implements Vehicle{
	int speed = 10;
	int gear;
	
	
	public void gearchange(int newGear){ // creat concreat methode:
		gear = newGear;
	}

	public void speedUp(int increment){
		speed += increment;
	}
	public void applyBreaks(int decrement){
		speed -=decrement;
	}

	void printStates(){
		System.out.println("Gear: " +gear +" " +"speed: " +speed);
	}
}

public class InterfaceAssign{
	public static void main(String args[]){
		Bicycle bicycle = new Bicycle();
		bicycle.gearchange(2);
		bicycle.speedUp(15);
		bicycle.applyBreaks(10);
		System.out.println("Present state of Bicycle is: ");
		bicycle.printStates();
	}
}