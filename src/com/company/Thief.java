package com.company;
public class Thief extends Noob {
    private float dodgeProba;
    private float criticalProba;
    public Thief(String name, int dmg, int lif, int i, float dodge, float critical){
        super(name, dmg, lif, i);
        this.dodgeProba    = dodge;
        this.criticalProba = critical;
    }
    public String toString(){
        String out = "";
        out = out + super.toString();
        out = out + "Dodge = " + this.dodgeProba + "\n";
        out = out + "Critical = " + this.criticalProba + "\n";
        return out;
    }
    void hurt(int dmg){
        // si le lancer de dé donne une valeur inferieure ou egalke a la proba d’esquive alors j’esquive
        // sinon je prends les degats
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
