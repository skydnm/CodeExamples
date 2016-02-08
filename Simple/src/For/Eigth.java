package For;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 8.Выведите на экран общие делители двух натуральных чисел.
 */
public class Eigth {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> flist = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральные числа: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.print("Общими делителями натуральных чисел являються: ");
        for (int i = a; i > 0; i--){
            int c = a%i;
            if(c == 0)
                list1.add(i);

        }
        for (int i = b; i > 0; i--){
            int c = b%i;
            if(c == 0)
                list2.add(i);
        }
        for (int i = 0; i < list1.size(); i++){
            for(int j = 0; j < list2.size(); j++){
                if(list1.get(i) == list2.get(j))
                    flist.add(list1.get(i));
            }
        }
        for(int i = 0; i < flist.size(); i++)
        System.out.println(flist.get(i));
    }
}

