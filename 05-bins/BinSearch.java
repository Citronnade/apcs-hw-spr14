import java.util.*;

public class BinSearch{
    public static int rbsearch(int n, int[] L){
	int current = L.length / 2;
	if (L[current] == n){
	    return current;
	}
	else if (L[current] < n){
	    int[] newAry = new int[L.length-current];
	    for (int i = 0; i < newAry.length; i++){
		newAry[i] = L[current];
		current++;
	    }
	    return rbsearch(n, newAry);
	}
	else{
	    int[] newAry = new int[current];
	    for (int i = 0; i < newAry.length; i++){
		newAry[i] = L[i];
	    }
	    return rbsearch(n, newAry);
		
	}
		    
    }

    public static void main(String args[]){
	int[] a = new int[200];
	Random r = new Random();
	for(int i = 0; i < 50; i++){
	    a[i] = r.nextInt(100);
	}
	long startTime = System.currentTimeMillis();	
	int[] answer = MergeSortInt.mergeSort(a);
	for (int i = 0; i < answer.length; i++){
	    System.out.print(answer[i] + ", ");
	}
	
	System.out.println();
	System.out.println(rbsearch(19, answer));
	

	long stopTime = System.currentTimeMillis();
	long elapsedTime = stopTime - startTime;
	System.out.println("Time elapsed: " + elapsedTime / 1000.0);

    }
}

