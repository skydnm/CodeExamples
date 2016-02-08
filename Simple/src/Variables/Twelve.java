package Variables;

/**
 * 12.Вывести в консоль половину массива, среднеарифметическое которых является наибольшим.
 */
public class Twelve {

    public static void main(String[] args) {
        int[] array = new int[]{4, 33, 1, 13, 23, -34, 1, 23, 122, 23, 34, 4, 8, 3, 13, 2, -5, 1, 3, 15};
        int firstPartOfArraySumma = 0;
        int secondPartOfArraySumma = 0;
        int middle = array.length / 2;
        for (int i = 0; i < array.length; i++) {
            if (i < middle) {
                firstPartOfArraySumma += array[i];
            } else {
                secondPartOfArraySumma += array[i];
            }
        }

        float firstPartAverage = (float) firstPartOfArraySumma / middle;
        float secondPartAverage = (float) secondPartOfArraySumma / (array.length - middle);
        if (firstPartAverage > secondPartAverage) {
            writeArrayPart(array, 0, middle);
        } else {
            writeArrayPart(array, middle, array.length );
        }
    }

    public static void writeArrayPart(int[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(array[i] + " ");
        }
    }
}