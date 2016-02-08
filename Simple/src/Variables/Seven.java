package Variables;



/**
 * 7.Найти минимальное и максимальное число в массиве.
 */
public class Seven {

    public static void main(String[] args) {
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++){
            list[i] = i;
        }

        int min = list[0];
        int max = list[0];

        for(int i = 0; i < list.length; i++){
            if (list[i] < min)
                min = list[i];
        }
        for(int i = 0; i < list.length; i++){
            if (list[i] > max)
                max = list[i];
        }
    }
}
