package Variables;

/**
 * 15.Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
 */
public class Fifteen {

    public static void main(String[] args) {
        int[] a = {5, 15, 23, 1, 32, 77, 4, 66, 3, 12, 11, 8};
        int maxone = a[0];
        int maxtwo = a[0];
        int imaxone = 0;
        int imaxtwo = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxone) {
                maxone = a[i];
                imaxone = i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (maxone > a[i] & a[i] > maxtwo){
                maxtwo = a[i];
                imaxtwo = i;
            }
        }
        a[imaxone] = a[0];
        a[imaxtwo] = a[11];
        a[0] = maxone;
        a[11] = maxtwo;
    }
}

