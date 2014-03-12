import java.util.*;
import java.lang.Random;

public class QSort{
    public static void QSort(int[] L){
	Random r = new Random();
	if (L.length <=1){
	    return L;
	}
	else{
	    int pivot = r.nextInt(L.length);
	    ArrayList lower = new ArrayList(pivot); //holds indices 0--> one before pivot
	    ArrayList upper = new ArrayList(L.length - pivot); //holds pivot --> end.  basically string slicing in python
	 
	    
	}

    }
}
