package com.company;

/**
 * Class Thief extender of Class Noob.
 */
public class Thief extends Noob {

    private float dodgeProba;
    private float criticalProba;

    /**
     * Attributes for Thief archetype. Contains "dodge" and "critical attack" more than Class Noob
     * @param name
     * @param dmg is an Integer
     * @param lif is an Integer
     * @param i is an Integer
     * @param dodge is an Float
     * @param critical is an Float
     */
    public Thief(String name, int dmg, int lif, int i, float dodge, float critical){
        super(name, dmg, lif, i);
        this.dodgeProba    = dodge;
        this.criticalProba = critical;
    }

    /**
     *
     * @return
     */
    public String toString(){
        String out = "";
        out = out + super.toString();
        out = out + "Dodge = " + this.dodgeProba + "\n";
        out = out + "Critical = " + this.criticalProba + "\n";
        return out;
    }

    /**
     * Function that makes Thief archetype can probably dodges an attack from his opponent
     * If the attack isn't dodge, the character takes damages from his opponent
     * @param dmg
     */
    void hurt(int dmg){
        if (Math.random()<=this.dodgeProba){
            System.out.println("Nope");
        }
        else {
            super.hurt(dmg);
        }
    }
   /*
   //Si le Voleur a deja CC -> ne peut pas refaire un CC. utiliser un booléen
   if(Math.random()<=this.criticalProba){
       super.hurt(dmg);
   }
       else{
       super.hurt(dmg*2);
       System.out.println(“Critical hit”);
   }
   */
}
