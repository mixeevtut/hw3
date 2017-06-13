package Array;

import java.lang.reflect.Array;

public class MinMax {
    void max(int[] array){
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println("Максимальное значение: " + maxValue);
    }
    void min(int [] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println("Минимальное значение: " + minValue);

    }
}
