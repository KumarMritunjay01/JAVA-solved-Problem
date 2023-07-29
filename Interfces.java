/*
Design and develop a context for given case study and implement an interface for Vehicles Consider
the example of vehicles like bicycle, car and bike. All Vehicles have common functionalities such as
Gear Change, Speed up and apply breaks. Make an interface and put all these common
functionalities. Bicycle, Bike, Car classes should be implemented for all these functionalities in their
own class in their own way.
 */

 interface Vehicle {
    public void gearChange();
    public void sppedUp();
    public void applyBreak();
 }

 class Bicycle implements Vehicle{
    public void gearChange(){
        System.out.println("Gare change of Bicyle: ");
    }

    public void sppedUp(){
        System.out.println("Speed up of Bycile: ");
    }

    public void applyBreak(){
        System.out.println("Apply Break of Bicyle: ");
    }
 }

 class Bike implements Vehicle{
    public void gearChange(){
        System.out.println("Gare change of Bike: ");
    }

    public void sppedUp(){
        System.out.println("Speed up of Bike: ");
    }

    public void applyBreak(){
        System.out.println("Apply Break of Bike: ");
    }
 }

 class Car implements Vehicle{
    public void gearChange(){
        System.out.println("Gare change of Car: ");
    }

    public void sppedUp(){
        System.out.println("Speed up of Car: ");
    }

    public void applyBreak(){
        System.out.println("Apply Break of Car: ");
    }
 }
 
 
 public class Interfces{
    public static void main(String[] args) {
        Vehicle v;
        v = new Bicycle();
        v.gearChange();
        v.sppedUp();
        v.applyBreak();
    }
 }