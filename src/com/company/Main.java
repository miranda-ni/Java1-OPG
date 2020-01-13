package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.health = 300;
        hero.damage = 25;
        hero.power = "To fly";

        System.out.println(hero.health + " " + hero.damage + " " + hero.power);
        Hero hero1 = new Hero(300,25,"To try");
        MagicDoor like = new MagicDoor();
        System.out.println(like.toReturn());











    }
}
