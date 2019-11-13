package com.company;

public class Noob {
    //properties
    private String name;
    private int damages;
    private int life;
    private int initiative;

    // constructor
    public Noob(String name) {
        this.name = name;
        this.damages = 10;
        this.life = 50;
        this.initiative = 20;


    }

    public String toString(){
        return "name=" + this.name + " damages=" + this.damages + " life=" + this.life + " initiative=" + this.initiative;
    }


    // get / set
    public String getName() {
        return this.name;
    }

    public int getDamages() {
        return this.damages;
    }

    public int getLife() {
        return this.life;
    }

    public int getInitiative() {
        return this.initiative;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamages(int damages) {
        this.damages = damages;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
}
