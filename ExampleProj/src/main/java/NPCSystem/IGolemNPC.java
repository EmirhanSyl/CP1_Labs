package NPCSystem;

/**
 *
 * @author emirs
 */
public interface IGolemNPC extends IMovement, IAttack{
    
    public static final int initialSpeed = 5;
    public void ChangeMorph();
    
}
