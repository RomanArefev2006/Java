import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        System.out.println("Автомобиль: ");
        garage.operateVehicle(car);
        System.out.println();

        System.out.println("Лодка: ");
        garage.operateVehicle(boat);
        System.out.println();

        System.out.println("Велосипед: ");
        garage.operateVehicle(bicycle);
        System.out.println();
    }
}