package com.company;

public class Wizard extends Noob {

    private int magicDamages;


    /**
     *
     * @param name
     * @param damages
     * @param life
     * @param initiative
     * @param magicDamages
     */
    public Wizard(String name, int damages, int life, int initiative, int magicDamages) {
        super(name, "wizard", damages, life, initiative );
        this.magicDamages = magicDamages;


    }

    public String toString() {
        String out = "";
        out = out + super.toString();
        out = out + "magicDamages = " + this.magicDamages + "\n";
        return out;

    }

    public int getDamages(){
        int wizardDamages = super.getDamages() + this.magicDamages;
        this.magicDamages = this.magicDamages/2;
        return wizardDamages;
    }
}
