package army;

public class HeavyCavalry extends MilitaryUnit {

    private static final int INITIAL_HITPOINTS = 150;
    private static final int INITIAL_DAMAGE = 20;
    private static final boolean INITIAL_ARMOR = true;
    private static final int FIRST_ATTACK_MULTIPLIER = 3;

    private boolean isFirstAttack = true;


    public HeavyCavalry() {
        super(INITIAL_HITPOINTS, INITIAL_DAMAGE, INITIAL_ARMOR);
    }

    //@Override
    public int doDamage2() {
        if (!isFirstAttack) {
            return super.doDamage();
        }
        isFirstAttack = false;
        return super.doDamage() * FIRST_ATTACK_MULTIPLIER;
    }

    @Override
    public int doDamage() {
        int res = isFirstAttack ?
                super.doDamage() * FIRST_ATTACK_MULTIPLIER :
                super.doDamage();

        isFirstAttack = false;

        return res;
    }
}
