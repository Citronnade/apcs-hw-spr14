public class MyLinkedList{
    private Node head;

    public MyLinkedList(){
	head = null;
    }
    public String toString(){
	String part = "";
	Node temp = head;
	while (temp != null){
	    // System.out.println(temp);
	    part += temp + "\n";
	    temp = temp.getNext();
	}
	return part;
    }
    
    public Node get(int i){ //since you can just toString this anyway into a String...
	Node temp = head;
	while (i > 0){
	    temp = temp.getNext();
	    if (temp == null){
		throw new NullPointerException(); //if you try to get one more than the length
	    }
	    i--;
	}
	return temp;
    }
    
    public String set(int i, String s){
	String old = get(i).getData();
	get(i).setData(s);

	return old;
    }
    
    public String remove(int i){
	if (i == 0){ //removing first one
	    Node prev = get(i);
	    head = head.getNext();
	    return prev.toString();
	}
	else{
	    Node prev = get(i);
	    Node temp = get(i+1);
	    get(i-1).setNext(temp);
	    return prev.getData();
	}
    }

    /*
    public void add(String s){ // adds to front
    	Node tmp = new Node(s);
    	tmp.setNext(head); // always first
    	head = tmp; //always second
    }
    */

    public void add(String s){
    	Node tmp = new Node(s);
    	tmp.setNext(head); // always first
    	head = tmp; //always second
    }

    public void add(int i, String s){
	Node temp = head;
	while (i > 0){
	    temp = temp.getNext();
	    i--;
	}
	System.out.println(temp);
	temp.setNext(new Node(s));
    }

    public static void main(String args[]){
	MyLinkedList L = new MyLinkedList();
	L.add("Sully");
	L.add("Mike");
	L.add("Blaraghagaerega");
        L.add("esgoheighoierres");
	System.out.println(L);
	System.out.println(L.set(3, "hihihihiihihi"));
	System.out.println(L.get(3));
	System.out.println();
	System.out.println(L);
	System.out.println(L.remove(1));
	System.out.println(L);

	//L.add(2, "Two");
	// L.add(3, "Three");
	// System.out.println(L);
    }
}
