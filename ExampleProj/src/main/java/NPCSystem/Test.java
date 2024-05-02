package NPCSystem;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Test {
    
    public static void main(String[] args) {
        
        IMovement golem = new FireGolemNPC();
        ArrayList<IMovement> npcs = new ArrayList<>();
        
        npcs.add(golem);
        npcs.add(new HumanoidNPC());
        npcs.add(new WolfNPC());
        
        for (IMovement npc : npcs) {
            npc.Idle();
        }
        
        
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        
    }
}
