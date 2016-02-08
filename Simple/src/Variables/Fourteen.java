package Variables;

/**
 * 14.Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
 */
public class Fourteen {

    public static void main(String[] args) {
        int[] a = {5,6,7,8,9,12,15,0,43,2,5,74,11};
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
            if (a[i] == 0)
                break;
        }
    }
}
