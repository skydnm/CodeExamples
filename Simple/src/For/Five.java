package For;

import java.util.Scanner;

/**
 * 5.Создайте программу, вычисляющую факториал натурального числа n .
 */
public class Five {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите факториал числа n: ");
        int n = scan.nextInt();
        int result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        System.out.println(result);
        if(n < 0)
            System.out.println("Вы ввели отрицательный факториал.");

    }
}
