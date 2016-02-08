package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int j = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());
        if(i < j && j < k)
            System.out.println(j);
        if(k < j && j < i)
            System.out.println(j);
        if(i < k && k < j)
            System.out.println(k);
        if(j < k && k < i)
            System.out.println(k);
        if(j < i && i < k)
            System.out.println(i);
        if(k < i && i < j)
            System.out.println(i);
    }
}
