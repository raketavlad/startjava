package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("Mark-3");
        jaeger1.setOrigin("USA");
        jaeger1.setHeight(79.25f);
        jaeger1.setWeight(1.980f);
        jaeger1.setStrength(30);
        jaeger1.setArmor(30);
        System.out.println("Модель робота: " + jaeger1.getModelName() +
                "\nМарка : " + jaeger1.getMark() + "\nПроизведен: " + jaeger1.getOrigin() +
                "\nВысота: " + jaeger1.getHeight() + " meters" +
                "\nВес: " + jaeger1.getWeight() + " tons" +
                "\nСила: " + jaeger1.getStrenght() + "\nБроня: " + jaeger1.getArmor() + "\n");
        
        Jaeger jaeger2 = new Jaeger("Crimson Typhon", "Mark-4", "China", 76.2f, 1.722f, 40, 40);
        jaeger2.showJaegerInfo(jaeger2);
        jaeger2.move(jaeger2);
        jaeger2.attackKaiju(jaeger2);
        jaeger2.hitKaiju(jaeger2);
        jaeger2.shootKaiju(jaeger2);
        jaeger2.jump(jaeger2);
    }
}