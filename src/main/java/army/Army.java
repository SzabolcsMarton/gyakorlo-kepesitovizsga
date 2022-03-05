package army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {

    private static final int DEATH_LIMIT = 25;

    private List<MilitaryUnit> units = new ArrayList<>();

    public  void addUnit(MilitaryUnit militaryUnit){
        units.add(militaryUnit);
    }

    public int getArmySize() {
        return units.size();
    }

    public void damageAll(int damage){
        Iterator<MilitaryUnit> iterator = units.iterator();
        while (iterator.hasNext()) {
            MilitaryUnit unit = iterator.next();
            unit.sufferDamage(damage);
            if(unit.getHitPoints() < DEATH_LIMIT){
                iterator.remove();
            }
        }
    }

    public int getArmyDamage() {
        return units.stream().mapToInt(MilitaryUnit::doDamage).sum();
    }
}
