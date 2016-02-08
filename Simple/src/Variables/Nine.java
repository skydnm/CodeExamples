package Variables;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 9.Подсчитать одинаковые числа в одномерном массиве.
 */
public class Nine {

    public static void main(String[] args) {
        int [] a  = new int [1000];
        ArrayList<Integer> list = new ArrayList<Integer>();


        for(int i=0;i<a.length;i++) {
            a[i]=(int)(Math.random()*10);
            if(list.contains(a[i]) == false) {
                list.add(a[i]);
            }
        }
        int c = 0;
        for(int i=0;i<list.size();i++) {
            for(int j=i;j<a.length;j++) {
                if(list.get(i).equals(a[j])) {
                    c++;
                }
            }
            System.out.println("Число " +list.get(i) + " встречается " +c +" раз ");
            c=0;
        }
    }
}

