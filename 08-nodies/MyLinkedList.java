public class MyLinkedList{
    private Node head;

    public MyLinkedList(){
	head = null;
    }
    public String toString(){
	return "" + head + head.getNext();
    }

    public void add(String d){
	Node tmp = new Node(d);
	tmp.setNext(head); // always first
	head = tmp; //always second
    }


    public static void main(String args[]){
	MyLinkedList L = new MyLinkedList();
	L.add("Sully");
	System.out.println(L);
	L.add("Mike");
	System.out.println(L);
    }
}
