import java.lang.*;
import java.util.*;

public class MaxHeap{
    public int[] values;
    private int size;
    // [0,1,2,3,4,5,0,0,0]

    public MaxHeap(){
	values = new int[10];
	values[0] = Integer.MAX_VALUE;
	for (int i = 1; i < values.length; i++){
	    values[i] = Integer.MIN_VALUE;
	}
	size = 0;
    }

    public int getRoot(){
	return values[1];
    }

    public String toString(){
	return Arrays.toString(values);
    }

    public MaxHeap(int[] nums){
	size = 0;
	values = new int[nums.length+1];
	values[0] = Integer.MAX_VALUE;
	for (int i = 0; i < nums.length; i++){
	    insert(nums[i]);
	    size++;
	}
	//size = nums.length;
	System.out.println(Arrays.toString(values));
    }

    private void swap(int first, int second){ //takes indicies
	int temp = values[first];
	values[first] = values[second];
	values[second] = temp;	     
	
    }

    private void grow(){
	int[] temp = new int[(int) (values.length*1.5+1)];
	for (int i = 0; i < values.length; i++){
	    temp[i] = values[i];
	}
	values = temp;
    }

    private void shrink(){
	int[] temp = new int[(int) (values.length / 1.5+1)];
	for (int i = 0; i < values.length; i++){
	    temp[i] = values[i];
	}
	values = temp;
    }


    public int size(){
	return size;
    }

    public void insert(int num){
	if (size >= values.length-1){
	    // System.out.println("growing");
	    grow();
	}
	
	int loc = size+1;
	values[loc] = num;
	// System.out.println("length of values: " + values.length);
	// System.out.println("size:" + size);
	while (values[loc/2] < values[loc]){ //can swap up
	    swap(loc/2, loc); //swap!
	    loc = loc/2; //move loc to new location
	}
	size++;
    }

    public int remove(){ 
	int loc = size;
	int removed = values[1];
	swap(loc, 1); //root is at 1!!
	values[loc] = Integer.MIN_VALUE;
	size--; //this pretty much deletes the node
	loc = 1; //where the swapped node went
	
	//	System.out.println(removed);

	while (loc <= size / 2) //time to swap it down
	    if (values[loc] < values[loc*2] || values[loc] < values[loc*2+1]){ //check if it can still be swapped
		if (values[loc*2] > values[loc*2+1]){ //left side is bigger
		    swap(loc, loc*2); //swap left
		    loc = loc*2; //move loc to new position
		}
		else{
		    swap(loc, loc*2+1); //swap right
		    loc = loc*2+1;
		}
		//		System.out.println(Arrays.toString(values));
	    }

	    else{
		break; //quit if it's in its normal position
	    }
	//	System.out.println(Arrays.toString(values));
	// if (size * 2 <= values.length){
	//     shrink();
	// }
	return removed;
    }
}
