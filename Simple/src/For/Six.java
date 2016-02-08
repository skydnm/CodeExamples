package For;

/**
 * 6.Выведите на экран первые 20 членов последовательности Фибоначчи.
 */
public class Six {

    public static void main(String[] args) {

        int a = 1;
        int b = 0;
        int fib = 0;
        for (int i = 0; i < 20; i++){
            fib = a + b;
            a = b;
            b = fib;
            System.out.println(fib);
        }
    }
}
