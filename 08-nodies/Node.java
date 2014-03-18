public class Node{
    private String data;
    private Node next;

    public Node(String d){
	data = d;
	next = null;   //slightly not needed
    }
    
    public void setData(String d){
	data = d;
    }

    public String getData(){
	return data;
    }

    public Node getNext(){
	return next;
    }
    
    public String toString(){
	return data;
    }

    public void setNext(Node n){
	next = n;
    }

    public static void main(String[] args){
	Node n1;
	n1 = new Node("Sully");
	// System.out.println(n1);
	// System.out.println(n1.getNext());
	
	Node n2 = new Node("Mike");
	// System.out.println(n2);
	// System.out.println(n2.getNext());

	n1.setNext(n2);
	n1.getNext().setNext(new Node("Randall"));
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext());

	System.out.println();
	
	/*
	n1.setNext(n1.getNext().getNext());
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	//	System.out.println(n1.getNext().getNext().getNext()); //after removal, this would attempt to access null
	*/

	n1.getNext().getNext().setNext(n1);  //next of randall now sully

	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext());
    }
}
