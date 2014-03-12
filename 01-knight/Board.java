public class Board{
    public String[][] squares;
    public static int counter;



    public Board(int rows, int cols){
	squares = new String[rows][cols];
	for (int i = 0; i < rows; i++){
	    for (int j = 0; j < cols; j++){
		squares[i][j] = "_";
	    }
	}
    }
    
    public Board(){
	this(5,5);
    }

    public String[][] getBoard(){
	return squares;
    }

    public String toString(){
	String str = new String();
	for (int i = 0; i < squares.length; i++){
	    str+= "\n";
	    for (int j = 0; j < squares[i].length; j++){
	        str += squares[i][j] + " ";
	    }
	}
	return str;
    }

    public static void delay(int n){
	try{
	    Thread.sleep(n);
	}
	catch(Exception e){
	    System.exit(0);
	}

    }

    public int knightSolve(int row, int col, int move){
	try{
	    if(squares[row][col] != "_"){
		return 0;
	    }
	    else{

		squares[row][col] = move + "";
	    
	    }
	}
	catch(Exception e){
	    return 0;
	}
	delay(5);
	counter++;

	System.out.println("[:H");
       	System.out.println(this);
	System.out.println("Iteration: " + counter);
	
	//	System.out.println(move);
	//	System.out.println(squares.length*squares[0].length);
	
	
	if (knightSolve(row+1,col-2, move + 1) == 1){
	    return 1;
	}
	if (knightSolve(row+1,col+2, move + 1) == 1){
	    return 1;
	}
	if (knightSolve(row-1,col-2, move + 1) == 1){
	    return 1;
	}
	if (knightSolve(row-1,col+2, move + 1) == 1){
	    return 1;
	}
	if (knightSolve(row+2,col-1, move + 1) == 1){
	    return 1;
	}
	if (knightSolve(row-2,col+1, move + 1) == 1){
	    return 1;
	}
	if (knightSolve(row+2,col+1, move + 1) == 1){
	    return 1;
	}
	if (knightSolve(row-2,col-1, move + 1) == 1){
	    return 1;
	}

	//System.out.println(success);
	//none of the options worked; go back

	if (move == squares.length*squares[0].length){ //but if we finished, everything will fail anyway--and we want to keep it.
	    return 1;
	}
	squares[row][col] = "_";
	return 0;
    }

    public static void main(String args[]){
	Board board = new Board(5,5);
	System.out.println("[2J");
	board.knightSolve(0,0,1);
	//	System.out.println(board);

    }
}
