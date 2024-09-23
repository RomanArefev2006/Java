import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число в кг: ");
            int kg = scan.nextInt();
            int gr = kg * 1000;
            int mgr = gr * 1000;
            System.out.println("Кг: " + kg + "\nГр: " + gr + "\nМгр: " + mgr);
        }
    }
}