package IfElse;

/**
 * 1.Задано три переменных, найти переменную с максимальным значением (Значение все переменных разные).
 */
public class One {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 7;
        if(a > b) {
            if (a > c)
                System.out.println("a - это максимальное значение");
            else
                System.out.println("c - это максимальное значение");
        } else {
            if(b > c)
                System.out.println("b - это максимальное значение");
            else
                System.out.println("c - это максимальное значение");
        }
    }
}
