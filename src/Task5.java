import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Ввод рандомно
        Scanner scanner = new Scanner(System.in);
        double[] masDouble = new double[scanner.nextInt()];
        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = (int) (Math.random() * 100);
            System.out.println(masDouble[i]);
        }
        System.out.println("---------------------");
        for (int i = masDouble.length - 1; i >= 0; i--) {
            System.out.println(masDouble[i]);
        }
        // //Ввод в ручную
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner1.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner1.nextInt();
        }
        System.out.println("---------------------");
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
