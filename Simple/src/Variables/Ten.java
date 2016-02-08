package Variables;



/**
 * 10.Поменять минимальное и максимальное числа в массиве местами  .
 */
public class Ten {

    public static void main(String[] args) {

        int[] list = {5,25,16,-5,18,19,40,80,101};
        int max = list[0];
        int min = list[0];
        int imin = 0;
        int imax = 0;

        for(int i = 0; i < list.length; i++){
            if(list[i] > max){
                max = list[i];
                imax = i;
            }
            if(list[i] < min) {
                min = list[i];
                imin = i;
            }
        }
        list[imax] = min;
        list[imin] = max;
    }
}
