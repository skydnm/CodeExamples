package For;

import java.util.Scanner;

/**
 * 7.Выведите на экран все положительные делители натурального числа.
 */
public class Seven {

    public static void main(String[] args) {

        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");

            a = scan.nextInt();
            System.out.print("Делителями натурального числа являються: ");
            for (int i = a; i > 0; i--){
                int b = a%i;
                if(b == 0)
                    System.out.print(i + " ");
            }
        }
    }

