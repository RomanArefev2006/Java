import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("nisan", "skyline", 2000, 2);
        Motorcycle moto1 = new Motorcycle("nisan", "skyline", 2000, true);
        car1.getDescription();
        System.out.println();
        moto1.getDescription();
    }
}