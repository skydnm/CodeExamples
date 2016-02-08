package Variables;

/**
 * 18.Вывести в консоль половину массива в которой находиться наименьшее число массива.
 */
public class Eighteen {

    public static void main(String[] args) {

        int[] array = {5,25,16,-5,18,19,40,80,101,-15,44,-25,-22,23};
        int minNumber = 0;
        int middle = array.length/2;

        for(int i = 0; i < array.length; i++){
            if(array[i] < minNumber)
                minNumber = array[i];
        }
        for (int i = 0; i < middle; i++) {
            if (minNumber == array[i]) {
                for (int j = 0; j < middle; j++)
                    System.out.println(array[j]);
            }
        }
        for(int i = middle; i < array.length; i++) {
            if (minNumber == array[i]) {
                for (int k = middle; k < array.length; k++)
                    System.out.println(array[k]);
            }
        }

    }
}
