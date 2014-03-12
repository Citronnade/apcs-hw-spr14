
import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
    private int[] moves;
    private int current;
    
    public DancingBug(int[] moves)
    {
	this.moves = moves;
    }
    public DancingBug(){
	this(new int[]{5, 6, 1, 2});
	current = 0;
    }

    
    public void act()
    {
	for (int i = 0; i < moves[current]; i++){
	    turn();
	}
	current++;
	super.act();
	if (current == moves.length){
	    current = 0;
	}
    }
}
