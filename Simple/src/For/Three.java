package For;

/**
 * 3.Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 */
public class Three {

    public static void main(String[] args) {

        int m = 90;
        while(m > 0){
            System.out.println(m);
            m = m - 5;
        }
    }
}
