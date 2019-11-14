package com.company;

public class Noob {


    //properties
    private String name;
    private int damages;
    private int life;
    private int initiative;
    private String archetype;

    /**
     * Constructor of default character
     * @param name is a String
     * @param damages is an Integer
     * @param life is an Integer
     * @param initiative is an Integer
     */

    public Noob(String name, String archetype , int damages, int life, int initiative) {
        this.name = name;
        this.archetype = archetype;
        this.damages = damages;
        this.life = life;
        this.initiative = initiative;

    }

    //----------------------------------------------------------------------------------------??????
    public Noob(String choice, String choice1) {
    }



    public String toString(){
        String out = "";
        out = out + "name       = " + this.name + "\n";
        out = out + "archetype  = " + this.archetype + "\n";
        out = out + "damages    = " + this.damages + "\n";
        out = out + "life       = " + this.life + "\n";
        out = out + "initiative = " + this.initiative + "\n";
        return out;
    }

    /**
     * Function that makes take damages to a character
     * @param damages
     */
    void hurt(int damages) {
        this.life = this.getLife() - damages;
    }


    /**
     * Getters
     *
     */
    public String getName() {
        return this.name;
    }

    public String getArchetype() {
        return this.archetype;
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

    /**
     * Setters
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    public String setArchetype() {
        return this.archetype;
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
