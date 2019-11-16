package com.company;

/**
 * Class Warrior extender of Class Noob
 */
public class Warrior extends Noob {

    private int shield;


    public Warrior(String name, int damages, int life, int initiative,int shield) {
        super(name,"warrior", damages, life, initiative);
        this.shield = shield;
    }

    public String toString() {
        String out = "";
        out = out + super.toString();
        out = out + "Shield = " + this.shield + "\n";
        return out;
    }

    void hurt(int dmg) {
        int damagesWithShield = dmg - shield;
        if (dmg > this.shield) {
            super.hurt(damagesWithShield);
        }



    }

    //get
    public int getShield(){
        return this.shield;
    }
}
