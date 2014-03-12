import info.gridworld.actor.Bug; 
 

public class CircleBug extends Bug 
{ 
    private int steps; 
    private int sideLength; 
 

    public CircleBug() 
    { 
	steps = 0;
	sideLength = 0;
    } 

    public CircleBug(int sideLength){
	this.sideLength = sideLength;
    }
 
 
    /** 
     * Moves to the next location of the square. 
     */ 
    public void act() 
    { 
	if (steps == sideLength){
	    turn();
	    steps = 0;
	}
	else{
	    steps++;
	}
	if (canMove()) 
	    { 
		move(); 
	    } 
    } 
}
