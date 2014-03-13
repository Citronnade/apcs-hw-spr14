import java.util.*;
import java.lang.*;

public class QSort{
    public static ArrayList<Integer> QSort(ArrayList<Integer> L){
	Random r = new Random();
	if (L.size() <=1){
	    return L;
	}
	else{
	    int pivot = r.nextInt(L.size());
	    ArrayList<Integer> lower = new ArrayList(pivot); //holds indices 0--> one before pivot
	    ArrayList<Integer>  upper = new ArrayList(L.size() - pivot); //holds pivot --> end.  basically string slicing in python
	    int pivotInt = L.get(pivot);
	    for (int i = 0; i < L.size(); i ++){
		if (i != pivot){ //dont put pivot back into list
		    if (L.get(i) < pivotInt){
			lower.add(L.get(i));
		    }
		    else{
			upper.add(L.get(i));
		    }
		    

		}
	    }
	    lower = QSort(lower);
	    upper = QSort(upper);
	    //System.out.println(lower);
	    // System.out.println(upper);
	    ArrayList<Integer> ans = new ArrayList<Integer>();
	    ans.addAll(lower);
	    ans.add(pivotInt);
	    ans.addAll(upper);	    //builtin way to concatenate arraylists.
	    return ans;
	    
	}

    }

    public static void main (String args[]){
	Random r = new Random();
	ArrayList tests = new ArrayList();
	for(int i = 0; i < 20; i++){
	    tests.add(r.nextInt(100));
	}
	System.out.println(tests);
	System.out.println();
	System.out.println(QSort(tests));
    }
}
