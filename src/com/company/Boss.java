package com.company;

import java.util.Random;

public class Boss {
    int health;
    String demage;
    int defence;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getDemage() {
        return demage;
    }

    public void setDemage(String demage) {
        this.demage = demage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }



    public Boss(){}
    public void protectType(){
        Random r = new Random ();
        int rundomNumber = r.nextInt(50)+1;
        defence = rundomNumber;




    }





    public Boss(int health, String power) {
        this.health = health;
        this.defence = defence;
        this.demage = power;

    }
}





