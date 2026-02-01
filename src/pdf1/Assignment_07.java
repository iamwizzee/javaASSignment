package pdf1;

class Vehicle {

    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car driving.");
    }
}

class SportCar extends Car {
    @Override
    void drive() {
        System.out.println("Sport car drivin faster.");
    }
}

public class Assignment_07 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Car car = new Car();
        car.start();
        car.drive();

        SportCar sportCar = new SportCar();
        sportCar.start();
        sportCar.drive();

    }
}