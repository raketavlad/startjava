package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf akella = new Wolf();
        akella.setGender("male");
        akella.setNickname("Akella");
        akella.setWeight(34.1f);
        akella.setAge(7);
        akella.setWoolColor("gray");
        System.out.println("Пол волка: " + akella.getGender() +
                "\nКличка волка: " + akella.getNickname() +
                "\nВес волка: " + akella.getWeight() + "\nВозраст волка: " + akella.getAge() +
                "\nОкрас волка: " + akella.getWoolColor());
        akella.go();
        akella.sit();
        akella.run();
        akella.howl();
        akella.hunt();
    }
}