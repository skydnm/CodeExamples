package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        String surName;
        String eyesColor;
        int age;
        int weight;
        int height;

        public Human(int age, int weight, int height)
        {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(int height, int weight)
        {

            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String surName, String eyesColor, int age, int weight)
        {

            this.name = name;
            this.surName = surName;
            this.eyesColor = eyesColor;
            this.age = age;

            this.weight = weight;
        }

        public Human(String name, int weight, int height, int age)
        {
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.age = age;
        }

        public Human(String name, String surName, int weight, int height)
        {

            this.name = name;
            this.surName = surName;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String surName, String eyesColor, int age)
        {

            this.name = name;
            this.surName = surName;
            this.eyesColor = eyesColor;
            this.age = age;
        }

        public Human(String name, String surName, int weight, int height, int age, String eyesColor)
        {

            this.name = name;
            this.surName = surName;
            this.weight = weight;
            this.height = height;
            this.age = age;
            this.eyesColor = eyesColor;
        }

        public Human(String name, String surName, String eyesColor)
        {

            this.name = name;
            this.surName = surName;
            this.eyesColor = eyesColor;
        }

        public Human(String eyesColor, int age)
        {
            this.eyesColor = eyesColor;
            this.age = age;
        }

        public Human(String name, String surName, int age)
        {

            this.name = name;
            this.surName = surName;
            this.age = age;


        }
    }
}
