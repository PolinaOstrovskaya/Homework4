import java.util.Scanner;

public class Task6 {
    public static  void main(String[] args) {
        //Ввод рандомно
        Scanner scanner = new Scanner(System.in);
        double[] masDouble = new double[scanner.nextInt()];
        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = (int) (Math.random() * 100);
            System.out.println(masDouble[i]);
        }
        System.out.println("---------------------");
        boolean flag = true;
        for (int i = 1; i < masDouble.length; i++) {
            if (masDouble[i] <= masDouble[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
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
        boolean flag1 = true;
        for (int i = 1; i < array.length; i++)
            if (array[i] <= array[i-1])
                if (array[i] <= array[i - 1]) {
                    flag1 = false;
                    break;
                }
     if (flag1) {
        System.out.println("Массив является строго возрастающей последовательностью");
    } else {
        System.out.println("Массив не является строго возрастающей последовательностью");
    }
}
}