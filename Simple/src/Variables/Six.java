package Variables;

/**
 * 6.Найти среднеарифметическое всех чисел массива.
 */
public class Six {
    public static void main(String[] args) {
        float[] list = new float[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        float s = 0;
        for (int i = 0; i < 20; i++) {
            s += list[i];
        }
        float b =s/list.length;
        System.out.println(b);

    }
}
