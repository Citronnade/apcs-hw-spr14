import java.lang.*;
import java.util.*;

public class MedianHeap{
    // public MinHeap minH;
    // public MaxHeap maxH;

    public PriorityQueue<Integer> minH;
    public PriorityQueue<Integer> maxH;

    private class maxComp implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2){
	    if (o1.compareTo(o2) >= 1){
		return -1;
	    }
	    else if (o1.compareTo(o2) == 0){
		return 0;
	    }
	    else{
		return 1;
	    }
	}

	// public boolean equals(Integer obj){
	//     return 
	// }
    }




    public int size;

    public MedianHeap(){
	minH = new PriorityQueue<Integer>();
	maxH = new PriorityQueue<Integer>(11, new maxComp());
	size = 0;
    }

    public void add(int num){
	if (maxH.peek() == null){
	    maxH.add(num);
	}

	else if (num > maxH.peek()){
	    minH.add(num);
	    // System.out.println("added " + num + " to min:" + minH);
	    //System.out.println("min's size():" + minH.size());
	}
	else{
	    maxH.add(num);
	    // System.out.println("added " + num + " to max:" + maxH);
	}
	size++;
	balance();
    }

    public double removeMedian(){ //gets median
	if (size == 0){
	    return 0; //in case icky stuff happens
	}
	if ((maxH.size() + minH.size()) % 2 == 0){ //even size
	    double ans = ((maxH.remove() + minH.remove()) / 2); //ew icky ints
	    size-=2; //since we removed 2.  maybe calculating on the fly's better, but more calls.
	    //shouldn't need to balance
	    ///...removing both is kind of awkward to deal with.
	    return ans;
	}
	else{
	    size--;
	    double ans = maxH.remove();
	    return ans;
	}
    }

    public double findMedian(){
	if (size == 0){
	    return 0; //in case icky stuff happens
	}
	if ((maxH.size() + minH.size()) % 2 == 0){ //even size
	    double ans = ((maxH.peek() + minH.peek()) / 2); //ew icky ints
	    //size-=2; //since we removed 2.  maybe calculating on the fly's better, but more calls.
	    //shouldn't need to balance
	    ///...removing both is kind of awkward to deal with.
	    return ans;
	}
	else{
	    // size--;
	    int ans = maxH.peek();
	    return ans;
	}
    }

    public void balance(){
	int deltaS = maxH.size() - minH.size();
	while (deltaS > 1){ //max heap is too big
	    minH.add(maxH.remove());
	    deltaS = maxH.size() - minH.size();
	}
	while (deltaS < 0){ //min heap is too big.  this makes it so that max.size() >= min.size()
	    maxH.add(minH.remove());
	    deltaS = maxH.size() - minH.size();
	}
    }
    
    public static void main (String[] args){
	
	MedianHeap heap = new MedianHeap();
	// System.out.println(heap.minH);
	// System.out.println(heap.maxH);

	for (int i = 0; i < 19; i++){
	    heap.add(i);

	}
	for (int i = 0; i < 19; i++){
	    System.out.println(heap.removeMedian());
	    System.out.println("max:" + heap.maxH);
	    System.out.println("min:" + heap.minH);
	    System.out.println("median:" + heap.findMedian());
	}
    }
}
