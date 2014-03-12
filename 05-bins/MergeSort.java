import java.util.*;
public class MergeSort{
    public static ArrayList<Comparable> mergeList(ArrayList<Comparable> a, ArrayList<Comparable> b){
	int size = a.size() + b.size();
	ArrayList<Comparable>  answer = new ArrayList<Comparable>(size);
	int current = 0;
	int currentB = 0;
	int i = 0;

	for (int j = 0; j < size; j++){
	    answer.add(0); //have to init arraylist
	}

	while (i < a.size() || currentB < b.size()){
	    if (currentB >= b.size()){
		//answer.add(a.get(i));
		answer.set(current, a.get(i));
		i++;
	    }
	    else if (i >= a.size()){
		//answer.add(b.get(currentB
		answer.set(current,b.get(currentB));
		currentB++;
	    }

	    else if(a.get(i).compareTo(b.get(currentB)) >= 0){
		// (a[i] > b[currentB]){
		
		answer.set(current, b.get(currentB));
		//		answer[current] = b[currentB];
		currentB++;
	    }
	    else{
		answer.set(current, a.get(i));
		//answer[current] = a[i];
		i++;
	    }
	    current++;

	}
	return answer;
	
    }

    public static ArrayList<Comparable> mergeSort(ArrayList<Comparable> a){
	int half = a.size() / 2;
	ArrayList<Comparable> a1 = new ArrayList(half);
	ArrayList<Comparable> a2 = new ArrayList(a.size()-half);

	for (int j = 0; j < half; j++){ //have to init arraylist
	    a1.add(0);
	}
	for (int j = 0; j < a.size() - half; j++){
	    a2.add(0);
	}
    
	if (a.size() <=1){
	    return a;
	}
	for (int i = 0; i < a1.size(); i++){
	    a1.set(i, a.get(i));
	    //a1.add(a.get(i));
	    //a1[i] = a[i];
	}
	for (int i = a1.size(); i < a.size(); i++){
	    a2.set(i-a1.size(), a.get(i));
	    //a2.add(a.get(i));
	    //a2[i-a1.size()] = a[i];
	}
	a1 = mergeSort(a1);
	a2 = mergeSort(a2);
	return mergeList(a1,a2);
    }





    public String toString(ArrayList<Comparable> a){
	String answer = "";
	for (int i = 0; i < a.size(); i++){
	    answer+=a.get(i) + ", ";
	}
	return answer;
    }

    public static void main(String args[]){
	//	int[] a = new int[]{1,2,7,1,6,8,23,7,4,8,1,33,5};
	//	int[] b = new int[]{0,2,-1,9,4};
	
	// int[] answer = mergeList(a,b);
	ArrayList<Comparable> a = new ArrayList<Comparable>(200);
	//System.out.println(a.size());
	Random r = new Random();
	// for(int i = 0; i < 200; i++){
	//     a.add(r.nextInt(100));
	// }

	// for (int i = 0; i < 200; i++){
	//     a.add(new Person());
	// }

	a.add(new Person());
	a.add(new Person(5, "hihihihih"));
	a.add(new Person(256, "hi wilbur"));
	a.add(new Person(27, "meow"));
	a.add(new Person(27, "Meow"));
	a.add(new Person(27, "MEOW"));
	a.add(new Person(62, "Waffles"));

	long startTime = System.currentTimeMillis();	
	ArrayList<Comparable> answer = mergeSort(a);
	for (int i = 0; i < answer.size(); i++){
	    System.out.print(answer.get(i) + ", ");
	}
	System.out.println();
	

	long stopTime = System.currentTimeMillis();
	long elapsedTime = stopTime - startTime;
	System.out.println("Time elapsed: " + elapsedTime / 1000.0);

    }

}
