package NPCSystem;

/**
 *
 * @author emirs
 */
public abstract class GolemNPC implements IGolemNPC{
    
    public int attackDuration;
    public double health;
    
    @Override
    public void Idle(){
        System.out.println("Idle");
    }
    @Override
    public void Jump(){
        System.out.println("Jump");
    }
    public void Patrol(){
        System.out.println("Patrol");
    }
    
    abstract void ThrowStones();
}
