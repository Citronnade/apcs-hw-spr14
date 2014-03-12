
import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int stage;
    public ZBug(int length)
    {
	stage = 0;
        steps = 0;
        sideLength = length;
	setDirection(90);
    }
    public ZBug(){
	this(4);
    }

    public void moveForward(){
	if (canMove()){
	    move();
	    steps++;
	    if (steps == sideLength){
		stage++;
		steps = 0;
	    }
		
	}
	else{
	    return;
	}
    }
    
    public void act()
    {
	if (stage == 0){
	    moveForward();
	}
	else if (stage == 1){
	    setDirection(225);
	    stage++;
	}
	else if (stage == 2){
	    moveForward();
	}
	else if (stage == 3){
	    setDirection(90);
	    stage++;
	}
	else if (stage == 4){
	    moveForward();
	}
	else{
	    return;
	}
	
    }
}
