package For;

/**
 * 4.Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class Four {

    public static void main(String[] args) {

        int m = 0;
        int j = 1;
        while(m < 20){
            j = j*2;
            System.out.println(j);
            m++;
        }
    }
}
