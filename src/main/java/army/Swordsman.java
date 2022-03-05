package army;

public class Swordsman extends MilitaryUnit{

    private static final int INITIAL_HITPOINTS = 100;
    private static final int INITIAL_DAMAGE = 10;
    private boolean hasShield = true;


    public Swordsman( boolean hasArmor) {
        super(INITIAL_HITPOINTS, INITIAL_DAMAGE, hasArmor);
    }


    @Override
    public void sufferDamage(int damage) {
        if(!hasShield){
            super.sufferDamage(damage);
        }
        hasShield = false;
    }
}
