package IfElse;

/**
 * 2.Написать алгоритм перевода в двоичную систему счисления любого числа от 1 до 127 и представить его в виде одного byte.
 * Пример 19 в двоичной системе 10011, в представлении byte это 0001 0011.
 */
public class Two {

    public static void main(String[] args) {

        int a, ost;
        a = 55;
        System.out.print("Число " + a);
        String c = "";
        for (int i = 0; i < 8; i++){
            ost = a % 2;
            a = a / 2;
            c = ost + c;
        }
        System.out.println(" в двоичной системе в виде одного byte = " + c);
    }
}
