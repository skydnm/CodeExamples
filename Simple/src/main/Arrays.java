package main;

/**
 * Created by Олександр on 26.05.2015.
 */
public class Arrays {

    public static void main(String[] args) {

        int a,b,c,d;

        byte e = 5 + 6;

        short f = 2 + 3;

        int g = 6 / 2;

        long h = 5 * 5;

        byte oneb = 5;
        byte twob = 10;
        byte sum =(byte)(oneb + twob);

        short ones = 10;
        short twos = 20;
        byte s = (byte)((ones + twos) / oneb);

        short div = (short) (twos / ones);
        byte div1 = (byte) (twob / oneb);
        int m = div * div1;

        a = 1;
        b = 2;
        c = a;
        a = b;
        b = c;

        a = a + b;
        b = a - b;
        a = a - b;

    }
}
