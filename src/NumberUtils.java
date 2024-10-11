import java.util.ArrayList;
import java.util.Scanner;

public class NumberUtils {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int num = scanner.nextInt();
        System.out.print("Введите пороговое значение: ");
        int end = scanner.nextInt();
        int []arr = new int[num];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Введите " + (i + 1) + " число: ");
            num = scanner.nextInt();
            arr[i] = num;
        }
        sort(arr, 0, arr.length - 1);

        System.out.println("\nМассив после сортировки:");
        for(int i : arr) {
            System.out.print(i + " ");
        }


        System.out.println("\nМассив с числами меньше порогового значения:");

        ArrayList<Integer> res = filter(arr, end);
        for(int i : res) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int []arr, int low, int high) {
        if (low < high) {

            int pi = quickSort(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    private static int quickSort(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static ArrayList<Integer> filter(int []arr, int num) {
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= num) {
                res.add(arr[i]);
            }
        }

        return res;
    }

}
