package Variables;

/**
 * 3.Вывести первую и вторую половину одномерного массива.
 */
public class Three {

    public static void main(String[] args){

        int[] list = new int[20];
        for(int i = 0; i < list.length; i++){
            list[i] = i;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(list[i]);
        }
        for(int i = 10; i < list.length; i++){
            System.out.println(list[i]);
        }

    }
}
