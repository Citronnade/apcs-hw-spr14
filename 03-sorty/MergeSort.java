import java.util.*;
public class MergeSort{
    public static int[] mergeList(int a[], int b[]){
	int size = a.length + b.length;
	int[] answer = new int[size];
	int current = 0;
	int currentB = 0;
	int i = 0;
	while (i < a.length || currentB < b.length){
	    if (currentB >= b.length){
		answer[current] = a[i];
		i++;
	    }
	    else if (i >= a.length){
		answer[current] = b[currentB];
		currentB++;
	    }

	    else if (a[i] > b[currentB]){
		answer[current] = b[currentB];
		currentB++;
	    }
	    else{
		answer[current] = a[i];
		i++;
	    }
	    current++;

	}
	return answer;
	
    }

    public static int[] mergeSort(int a[]){
	int half = a.length / 2;
	int[] a1 = new int[half];
	int[] a2 = new int[a.length-half];
	if (a.length <=1){
	    return a;
	}
	for (int i = 0; i < a1.length; i++){
	    a1[i] = a[i];
	}
	for (int i = a1.length; i < a.length; i++){
	    a2[i-a1.length] = a[i];
	}
	a1 = mergeSort(a1);
	a2 = mergeSort(a2);
	return mergeList(a1,a2);
    }





    public String toString(int[] a){
	String answer = "";
	for (int i = 0; i < a.length; i++){
	    answer+=a[i] + ", ";
	}
	return answer;
    }

    public static void main(String args[]){
	//	int[] a = new int[]{1,2,7,1,6,8,23,7,4,8,1,33,5};
	//	int[] b = new int[]{0,2,-1,9,4};
	
	// int[] answer = mergeList(a,b);
	int[] a = new int[200];
	Random r = new Random();
	for(int i = 0; i < 200; i++){
	    a[i] = r.nextInt(100);
	}
	long startTime = System.currentTimeMillis();	
	int[] answer = mergeSort(a);
	for (int i = 0; i < answer.length; i++){
	    System.out.print(answer[i] + ", ");
	}
	System.out.println();
	

	long stopTime = System.currentTimeMillis();
	long elapsedTime = stopTime - startTime;
	System.out.println("Time elapsed: " + elapsedTime / 1000.0);

    }

}
