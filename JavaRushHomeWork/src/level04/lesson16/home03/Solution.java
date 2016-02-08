package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        int sum = 0;
        while (number != -1){
            number = Integer.parseInt(reader.readLine());
            sum += number;
        }
        System.out.println(sum);
    }

    String name;
    int age;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {

        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
