package army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int damagePoints;
    private boolean hasArmor;

    public MilitaryUnit(int hitPoints, int damagePoints, boolean hasArmor) {
        this.hitPoints = hitPoints;
        this.damagePoints = damagePoints;
        this.hasArmor = hasArmor;
    }

    public int doDamage(){
        return damagePoints;
    }

    public void sufferDamage(int damage){
        if(hasArmor){
            hitPoints -= (damage / 2);
        }else {
            hitPoints -= damage;
        }
    }


     public int getHitPoints(){
        return hitPoints;
     }
}
