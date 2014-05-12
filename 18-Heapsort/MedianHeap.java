public class MedianHeap{
    private MinHeap minH;
    private MaxHeap maxH;
    private int size;

    public MedianHeap(){
	minH = new MinHeap();
	maxH = new MaxHeap();
	size = 0;
    }

    public void insert(int num){
	if (num > maxH.getRoot()){
	    minH.insert(num);
	}
	else{
	    maxH.insert(num);
	}
	size++;
	balance();
    }

    public int remove(){ //gets median
	if (size = 0){
	    return 0; //in case icky stuff happens
	}
	if ((maxH.size() + minH.size()) % 2 == 0){ //even size
	    int ans = (int)((maxH.remove() + minH.remove()) / 2); //ew icky ints
	    size-=2; //since we removed 2.  maybe calculating on the fly's better, but more calls.
	    //shouldn't need to balance
	    ///...removing both is kind of awkward to deal with.
	    return ans;
	}
	else{
	    size--;
	    int ans = maxH.remove();
	    return ans;
	}
    }

    public void balance(){
	int deltaS = maxH.size() - minH.size();
	while (deltaS > 1){ //max heap is too big
	    minH.insert(maxH.remove());
	    deltaS = maxH.size() - minH.size();
	}
	while (deltaS < 0){ //min heap is too big.  this makes it so that max.size() >= min.size()
	    maxH.insert(minH.remove());
	    deltaS = maxH.size() - minH.size();
	}
    }
    
    public static void main (String[] args){
	
	MedianHeap heap = new MedianHeap();
	for (int i = 0; i < 10; i++){
	    heap.insert(i);
	}
	for (int i = 0; i < 10; i++){
	    System.out.println(heap.remove());
	}
    }
}
