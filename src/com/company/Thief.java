package com.company;

/**
 * Class Thief extender of Class Noob.
 */
public class Thief extends Noob {

    private float dodgeProba;
    private float criticalProba;
    private boolean isLastCrit;

    /**
     * Attributes for Thief archetype. Contains "dodge" and "critical attack" more than Class Noob
     *
     * @param name       is a string
     * @param damages    is an Integer value for damages point
     * @param life       an Integer value for Health's point
     * @param initiative is an Integer value for the initiative
     * @param dodge      is an Integer value for the dodge probability between 0 and 100
     * @param critical   is an Integer value for the critical's Hit between 0 and 100
     */
    public Thief(String name, int damages, int life, int initiative, int dodge, int critical) {
        super(name, "thief", damages, life, initiative);
        this.dodgeProba = dodge;
        this.criticalProba = critical;
        this.isLastCrit = false;
    }

    /**
     * @return
     */
    public String toString() {
        String out = "";
        out = out + super.toString();
        out = out + "Dodge      = " + this.dodgeProba + "\n";
        out = out + "Critical   = " + this.criticalProba + "\n";
        return out;
    }

    /**
     * Function that makes Thief archetype can probably dodges an attack from his opponent
     * If the attack isn't dodge, the character takes damages from his opponent
     *
     * @param dmg
     */
    void hurt(int dmg) {
        if ((Math.random()*100) <= this.dodgeProba) {
            System.out.println("Nope");
        } else {
            super.hurt(dmg);
        }
    }


    /**
     *
     * @return
     */
    public int getDamages() {

        if ((Math.random()*100) <= this.criticalProba && isLastCrit == false) {
            int d = super.getDamages() * 2;
            isLastCrit = true;
            return d;

        } else {
            isLastCrit = false;
            return super.getDamages();
        }
    }


}

