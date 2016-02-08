package Variables;

/**
 * 2.Вывести все числа одномерного массива в обратном порядке.
 */
public class Two {

    public static void main(String[] args) {

        int[] list = new int[20];
        for(int i = 0; i < list.length; i++){
            list[i] = i;
        }
        for(int i = 19; i > -1; i--){
            System.out.println(list[i]);
        }
    }
}
