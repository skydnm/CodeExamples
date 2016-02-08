package Variables;

/**
 * 16.Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.
 */
public class Sixteen {

    public static void main(String[] args) {

        int[] a = {5,15,4,6,7,9,12,13,32,41,55,65,61,11,0,-5};

        for(int i = a.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(a[j] < a[j + 1]){
                    int tmp = a[j + 1];
                    a[j + 1] = a [j];
                    a[j] = tmp;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
