public class DoubleLL<E>{
    private class Node<E>{
	E data;
	Node<E> next, prev;
	public Node (E d){
	    this.data = d;
	}
	public String toString(){
	    return ""+ data;
	}
	public void setData(E d) {
	    data = d;
	}
	public void setNext(Node<E> n){
	    next = n;
	}
	public Node<E> getNext(){
	    return next;
	}
	public void setPrev(Node<E> p){
	    prev = p;
	}
	public Node<E> getPrev(){
	    return prev;
	}
	public E getData(){
	    return data;
	}
	
    }

    private Node<E> current;
    private Node<E> head, tail;
    
    public DoubleLL(){
	head = null;
	tail = null;
    }

    

    public void insert(E d){
	Node<E> n = new Node<E>(d);
	if (current == null){
	    current = n;
	    head = current;
	    tail = current;
	    current.setNext(current);
	    current.setPrev(current);
	}
	else{
	    n.next = current;
	    n.prev = current.getPrev();
	    if (current.getPrev() != null){
		current.getPrev().next = n;
	    }
	    current.prev = n;
	    current = n;
	}
	
	if (current.prev == null){
	    //current is the new head
	    current.setPrev(tail);
	    tail.setNext(current);
	}

	System.out.println("prev: " + current.prev);
	System.out.println("getPrev: " + current.getPrev());
	System.out.println("next: " + current.next);
	System.out.println("getNext: " + current.getNext());
    }

    //  public void delete(

    public E getCurrent(){
	return current.getData();
    }

    public void forward(){
	if (current.getNext() != null){
	    current = current.getNext();
	}
    }
    
    public void back(){
	if (current.getPrev() != null)
	    current = current.getPrev();
    }
    /*    
    public String toString(){
	if (current == null)
	    return "";
	while (current.getPrev() != null)
	    current = current.getPrev();

	Node<E> tmp = current;
	String s = "";
	while (tmp != null){
	    s = s + tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }
    */
    /*
    public String toString(){ //before double linked
	Node<E> temp2 = current;
	Node<E> startNode = current;
	if (temp2 == null)
	    return "";
	while (temp2.getPrev() != null){
	    //System.out.println(temp2);
	    temp2 = temp2.getPrev();
	}
	Node<E> tmp = temp2;
	String s = "";
	System.out.println("start:" + tmp);
	while (tmp != null){
	    s = s + tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }
    */
    public String toString(){
	Node<E> temp2 = current;
	Node<E> startNode = current;
	if (temp2 == null)
	    return "";
	while (temp2.getPrev() != tail){//at head
	    //System.out.println(temp2);
	    temp2 = temp2.getPrev();
	}
	Node<E> tmp = temp2;
	String s = "";
	System.out.println("start:" + tmp);
	//this should be a do-while loop
	while (tmp != tail){ //stops one before the tail
	    s = s + tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	s = s + tmp.getData() + " "; //adds the tail
	return s;
    }

    public int find(String e){ //infintie loop????
	//returns 0 if not in list, or the number of times it is
	int sum = 0;
	Node<E> temp = head.getNext();
	while (temp != head){
	    if (temp.getData().equals(e)){
		sum+=1;
	    }
	}
	if (temp.getData().equals(e)){ //finish the last one
	    sum+=1;
	}
	return sum;
	

    }

    public static void main(String[] args){
	DoubleLL<String> L = new DoubleLL<String>();
	//	System.out.println(L);
	L.insert("Hello");
	//System.out.println(L);
	L.insert("world");
	//System.out.println(L);
	L.insert("three");
	L.forward();
	L.forward();
	L.insert("uhm");
	System.out.println(L);
	System.out.println(L.find("three"));
	L.insert("three");
	System.out.println(L.find("three"));
	//first test up to htere
	/*
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
	//then test again to here
	*/
    }
    
    
    
}
