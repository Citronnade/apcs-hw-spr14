import java.util.*;

public class MapComparison{
    public static void main(String[] args){
	Random r = new Random(5);
	HashMap hash = new HashMap(10);
	TreeMap tree = new TreeMap();
	// hash with auto resize
	long time = System.currentTimeMillis();
	for (int i = 0; i < 5000000; i++){
	    Integer h = new Integer(Integer.toString(r.nextInt()).hashCode());
	    Integer v = new Integer(i);
	    hash.put(h, v);
	}
	long time2 = System.currentTimeMillis();
	System.out.println("Time elapsed for 5m HashMap with auto resize: " + (time2-time) + "ms");

	//hash without auto resize
	hash = new HashMap(5000000);
	r = new Random(5);
	time = System.currentTimeMillis();
	for (int i = 0; i < 5000000; i++){
	    Integer h = new Integer(Integer.toString(r.nextInt()).hashCode());
	    Integer v = new Integer(i);
	    hash.put(h, v);
	}
	time2 = System.currentTimeMillis();
	System.out.println("Time elapsed for 5m HashMap without auto resize: " + (time2-time) + "ms");
    

	r = new Random(5);
	time = System.currentTimeMillis();
	for (int i = 0; i < 5000000; i++){
	    Integer h = new Integer(Integer.toString(r.nextInt()).hashCode());
	    Integer v = new Integer(i);
	    tree.put(h, v);
	}
	time2 = System.currentTimeMillis();
	System.out.println("Time elapsed for 5m TreeMap: " + (time2-time) + "ms");
    }



}
