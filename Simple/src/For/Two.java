package For;

/**
 * 2.Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 */
public class Two {

    public static void main(String[] args) {
        int m = 0;
        int j = 1;
        while(m < 55){
            System.out.println(j);
            j = j + 2;
            m++;
        }
    }
}
