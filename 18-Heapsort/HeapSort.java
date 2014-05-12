import java.util.*;

public class HeapSort{
    public static void sort(int[] nums){
	MaxHeap heap = new MaxHeap(nums);
	int size = heap.size();
	for (int i = 0; i < size; i++){
	    nums[i] = heap.remove();
	}
    }
    public static void sortMin(int[] nums){
	MinHeap heap = new MinHeap(nums);
	int size = heap.size();
	for (int i = 0; i < size; i++){
	    nums[i] = heap.remove();
	    // System.out.println("i: " + i + "       removed: " + nums[i]);
	    // System.out.println("size:" + heap.size());
	}
    }


    public static void main (String[] args){
	int[] blargh = {1,5,3,7,45,2,-6,-6,0};
	System.out.println("unsorted: " + Arrays.toString(blargh)); 
	sort(blargh);
	System.out.println("sorted: " + Arrays.toString(blargh));
	sortMin(blargh);
	System.out.println("minsorted: " + Arrays.toString(blargh));

	MinHeap blargh2 = new MinHeap(blargh);
	blargh2.insert(5);
	blargh2.insert(26);
	System.out.println(Arrays.toString(blargh2.values));
    }
}
