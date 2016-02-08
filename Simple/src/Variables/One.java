package Variables;

/**
 * 1.Вывести в консоль все парные числа одномерного массива.
 */
public class One {

    public static void main(String[] args) {

            int[] list = new int[15];
            for (int i = 0; i < list.length; i++) {
                list[i] = i + 1;
                if (list[i] % 2 == 0)
                    System.out.println(list[i]);
            }
    }
}



