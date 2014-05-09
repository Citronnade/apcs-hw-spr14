import java.lang.*;

public class MyHeap{
    private int[] values;
    private int size;
    // [0,1,2,3,4,5,0,0,0]
    public MyHeap(){
	this(new int[10]);
    }
    
    public MyHeap(int[] nums){
	values = new int[nums.length+1];
	values[0] = Integer.MAXVALUE;
	for (int i = 0; i < nums.size; i++){
	    values[i+1] = nums[i];
	}
	size = nums.length;
    }

    private void swap(int first, int second){ //takes indicies
	int temp = values[first];
	values[first] = values[second];
	values[second] = temp;	     
	
    }

    public void insert(int num){
	int loc = size+1;
	values[loc] = num;
	while (values[loc/2] < num){
	    swap(loc/2, loc);
	    loc = loc/2;
	}	
    }

    public int removeMax(){
	int loc = size;
	int removed = values[1];
	swap(loc, 1); //root is at 1!!
	loc = 1; //where node wnet
	while ((loc <= size * 2) && (values[loc] > values[loc*2] || values[loc] > values[loc*2+1])){
	    if (values[loc*2] > values[loc*2+1]){
		swap(loc, loc*2);
		loc = loc*2;
	    }
	    else{
		swap(loc, loc*2+1);
		loc = loc*2+1;
	    }
	}
	return removed;
    }
}
