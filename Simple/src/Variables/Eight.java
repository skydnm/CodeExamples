package Variables;

/**
 * 8.Заменить все отрицательные числа в массиве на 0.
 */
public class Eight {

    public static void main(String[] args) {
            int[] list = {5,8,23,43,15,-8,-11,1,0,-23,33};
        for(int i =0; i < list.length; i++){
            if(list[i] < 0){
                list[i] = 0;
            }
        }
    }
}
