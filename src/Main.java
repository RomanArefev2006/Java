import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Угадай число
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        int num;
        int count = 0;

        do {
            System.out.print("Введите число: ");
            num = scanner.nextInt();
            count++;
            if (num > randomNumber) {
                System.out.println("Загаданное число меньше");
            } else if (num < randomNumber) {
                System.out.println("Загаданное число больше");
            }

        }while(num != randomNumber);

        System.out.println("Вы выиграли!\nБыло использовано попыток:"+ count +"\nБыло загаданно число: " + randomNumber);

        // Поле чудес

    }
}