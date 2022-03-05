package army;

public class Archer extends MilitaryUnit{
    private static final int INITIAL_HITPOINTS = 50;
    private static final int INITIAL_DAMAGE = 20;
    private static final boolean INITIAL_ARMOR = false;


    public Archer() {
        super(INITIAL_HITPOINTS, INITIAL_DAMAGE, INITIAL_ARMOR);
    }

    public int getHitPoints() {
        return super.getHitPoints();
    }
}
