package Variables;

/**
 * 4.Вывести первую и вторую половину одномерного массива в обратном порядке.
 */
public class Four {

    public static void main(String[] args) {
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        for (int i = 19; i > 9; i--) {
            System.out.println(list[i]);
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}
