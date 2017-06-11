package Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MinMax size = new MinMax();
        System.out.print("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * num);
        }
        size.Max(array);
        size.Min(array);
    }
}
