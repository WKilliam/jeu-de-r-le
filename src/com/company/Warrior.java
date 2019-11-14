package com.company;

/**
 * Class Warrior extender of Class Noob
 */
public class Warrior extends Noob {

    private int shield;


    public Warrior(String name, int dmg, int lif, int i,int sh) {
        super(name,"warrior", dmg, lif, i);
        this.shield = sh;
    }

    public String toString() {
        String out = "";
        out = out + super.toString();
        out = out + "Dodge = " + this.shield + "\n";
        return out;
    }

    //get
    public int getShield(){
        return this.shield;
    }
}
