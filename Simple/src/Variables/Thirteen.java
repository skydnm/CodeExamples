package Variables;

import java.util.ArrayList;

/**
 * 13.Найти индексы положительных чисел и сумму отрицательных чисел в одномерном массиве.
 */
public class Thirteen {

    public static void main(String[] args) {

        int[] array = {5,25,16,-5,18,19,40,80,101,-15,44,-25,-22,23};
        ArrayList<Integer> indexPositiveNumbers = new ArrayList<Integer>();
        int sumNegativeNumbers = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                sumNegativeNumbers += array[i];
            }
            if (array[i] > 0){
                indexPositiveNumbers.add(i);
            }
        }
        for (int i = 0; i < indexPositiveNumbers.size(); i++)
            System.out.println(indexPositiveNumbers.get(i));

        System.out.println(sumNegativeNumbers);
    }

}
