import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Ввод рандомно
        Scanner scanner = new Scanner(System.in);
        double[] masDouble = new double[scanner.nextInt()];
        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = (int) (Math.random() * 100);
            System.out.println(masDouble[i]);
        }
        int min = (int) masDouble[0];
        int max = (int) masDouble[0];
        int minIndex = 0;
        int maxIndex = 0;
        int zeroCount = 0;
        for (int i = 1; i < masDouble.length; i++) {
            if (masDouble[i] < min) {
                min = (int) masDouble[i];
                minIndex=i;
            }
            if (masDouble[i] > max) {
                max = (int) masDouble[i];
                maxIndex=i;
            }
            if (masDouble[i] == 0) { // если элемент равен нулю, увеличиваем счетчик
                zeroCount++;
            }
        }
        if (zeroCount == 0) { // если нулевых элементов нет, выводим соответствующее сообщение
            System.out.println("Нулевых элементов нет");
        } else {
            System.out.println("Количество нулевых элементов: " + zeroCount);

        }
        //Ввод в ручную
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner1.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner1.nextInt();
        }
        int min1 = array[0];
        int max1= array[0];
        int minIndex1 = 0;
        int maxIndex1= 0;
        for (int i = 1; i <length; i++) {
            if (array[i] < min1) {
                min1 =  array[i];
                minIndex1=i;
            }
            if (array[i] > max1) {
                max1 = array[i];
                maxIndex1=i;
            }
            if (array[i] == 0) { // если элемент равен нулю, увеличиваем счетчик
                zeroCount++;
            }
        }
        if (zeroCount == 0) { // если нулевых элементов нет, выводим соответствующее сообщение
            System.out.println("Нулевых элементов нет");
        } else {
            System.out.println("Количество нулевых элементов: " + zeroCount);
        }
    }
    }