package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human kid1 = new Human("kid1", 11, false);
        Human kid2 = new Human("kid2", 13, false);
        Human kid3 = new Human("kid3", 14, true);
        ArrayList<Human> kids = new ArrayList<Human>();
        kids.add(kid1);
        kids.add(kid2);
        kids.add(kid3);

        Human mother = new Human("Мама", false, 44, kids);
        Human father = new Human("Папа", true, 45, kids);

        ArrayList<Human> kk1 = new ArrayList<Human>();
        ArrayList<Human> kk2 = new ArrayList<Human>();
        kk1.add(mother);
        kk2.add(father);



        Human grandFather1 = new Human("Папа2", true, 77, kk1);
        Human grandFather2 = new Human("Папа3", true, 77, kk2);
        Human grandMother1 = new Human("Мама2", false, 88, kk1);
        Human grandMother2 = new Human("Мама3", false, 88, kk2);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, int age, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
