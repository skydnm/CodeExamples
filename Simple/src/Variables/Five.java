package Variables;

/**
 * 5.Найти сумму всех элементов в массиве.
 */
public class Five {

    public static void main(String[] args) {
        int[] list = new int[20];
        int m = 0;
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
            m += list[i];
        }
       System.out.println(m);


    }
}
