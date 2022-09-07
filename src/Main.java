import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Human Masha = new Human(3);
        Masha.cats[0].setNickname("Rale");
        Masha.cats[0].setAge(11);
        Masha.cats[0].setWeight(15);
        Masha.cats[0].setSex("m");
        Masha.cats[0].setHeight(110);

        Masha.cats[1].setNickname("Jane");
        Masha.cats[1].setAge(15);
        Masha.cats[1].setWeight(6);
        Masha.cats[1].setSex("f");
        Masha.cats[1].setHeight(112);

        Masha.cats[2].setNickname("Lex");
        Masha.cats[2].setAge(7);
        Masha.cats[2].setWeight(9);
        Masha.cats[2].setSex("m");
        Masha.cats[2].setHeight(108);

        System.out.println(Masha.getAltCat());
        System.out.println(Masha.getWeightCat());
        System.out.println(Masha.getNumberCat("Lex"));

        HouseCat Jack = new HouseCat();
        Jack.setNickname("Jack");
        Jack.setAge(11);
        Jack.setWeight(15);
        Jack.setSex("m");
        Jack.setHeight(110);
        System.out.println(Jack.DegreeOfObesity());


    }
    /*
    TODO
    Создать класс Домашний Кот. Поля - вес, пол, возраст, рост, кличка
    Методы - голос, метод проверки возраста: если возраст больше 10 - выводим "старый", иначе - молодой
    метод степени ожирения. Возвращает степень ожирения(это число от 1 до 5)


    Общие требования - все поля приватны, на каждое поле геттер и сеттер(все проверки для них)


    *Создать класс Human. Добавить к нему массив из котов как поле класса.
    Сделать ему методы:
    1)Вернуть самого жирного кота
    2)Вернуть самого старого кота
    3)Заполнить всех котов(инициализация)
    4)Вернуть номер кота по кличке(клички уникальны)

     */
}
