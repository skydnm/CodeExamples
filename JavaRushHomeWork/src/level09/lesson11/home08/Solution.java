package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {6, 7};
        int[] three = {8,9, 10, 11};
        int[] four = {12, 13, 14, 15, 16, 17, 18};
        int[] five = {};
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
