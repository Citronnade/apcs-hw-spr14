import java.util.*;

public class HeapSort{
    public static void sort(int[] nums){
	MyHeap heap = new MyHeap(nums);
	int[] temp = new int[heap.size()];
	for (int i = 0; i < temp.length; i++){
	    nums[i] = heap.removeMax();
	}
    }

    public static void main (String[] args){
	int[] blargh = {1,5,3,7,45,2,-6,-6,0};
	System.out.println("unsorted: " + Arrays.toString(blargh)); 
	sort(blargh);
	System.out.println("sorted: " + Arrays.toString(blargh));
	     
    }
}
