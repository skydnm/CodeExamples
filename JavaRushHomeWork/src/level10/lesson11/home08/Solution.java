package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код[
        ArrayList<String>[] list = new ArrayList[3];
        ArrayList<String> st = new ArrayList<String>();
        ArrayList<String> st1 = new ArrayList<String>();
        ArrayList<String> st2 = new ArrayList<String>();
        st.add("sdf");
        st1.add("sdfdf");
        st2.add("sdffdf");
        list[0] = st;
        list[1] = st1;
        list[2] = st2;


        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}