package NPCSystem;

/**
 *
 * @author emirs
 */
public class FireGolemNPC extends GolemNPC {

    public int speed;

    @Override
    public void HeavyAttack() {
        super.attackDuration = 8;
    }

    @Override
    public void MediumAttack() {
        super.attackDuration = 4;
    }

    @Override
    public void CounterAttack() {
        super.attackDuration = 1;
    }

    @Override
    public void ChangeMorph() {

    }

    @Override
    void ThrowStones() {

    }

}
