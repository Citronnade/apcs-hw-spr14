import java.util.*;

public class LinkedListTail{
    private Node head;
    private Node tail;

    public LinkedListTail(){
	head = new Node("dummy");
	tail = head;
	//head.setNext(tail);
	
    }

    public String toString(){
	String s = "";
	Node temp = head.getNext();
	while (temp != null){
	    s += temp + " ";
	    temp = temp.getNext();
	}
	return s;
    }

    public void add (E d){
	Node add = new Node(d);
	tail.setNext(add);
	tail = add;
	/*
	while (temp.getNext() != null){
	    temp = temp.getNext();
	}
	temp.setNext(add);//works no matter what is in the array
	*/
    }

    public void add(int i, E s){
	Node adding = new Node(s);
	Node prev = head;
	Node temp = head.getNext();
	while (i > 0){
	    prev = temp;
	    temp = temp.getNext();
	    i--;
	}
	adding.setNext(temp);
	
	prev.setNext(adding);
	if (temp == null){
	    tail = adding;
	}

    }
    
    public String get(int i){
	Node temp = head.getNext();
	int j = 0;
	while (temp != null){
	    if (i == j){
		return temp.getData();
	    }
	    j++;
	    temp = temp.getNext();
	}
	return null;
	
    }

    public String set(int i, E s){
	Node prev = head;
	Node temp = head.getNext();
	Node change = new Node(s);
	int j = 0;
	while (temp != null){
	    if (i == j){
		change.setNext(temp.getNext());
		prev.setNext(change);
		if (temp.equals(tail)){
		    tail = change;
		}
		return temp.getData();
	    }
	    prev = temp;
	    temp = temp.getNext();
	    j++;
	}
	return null;
    }

    public Node getTail(){
	return tail;
    }
    
    public String remove(int i){
	Node prev = head;
	Node temp = head.getNext();
	int j = 0;
	while (temp != null){
	    if (i == j){
		prev.setNext(temp.getNext());
		if (temp.getNext() == null){
		    tail = prev;
		}
		return temp.getData();
	    }
	    prev = temp;
	    temp = temp.getNext();
	    j++;
	}
	
	return null;
    }

    public int find (String s){
	int ind = 0;
	Node temp = head.getNext();
	while (temp != null){
	    if (s.equals(temp.getData())){
		return ind;
	    }
	    ind++;
	    temp = temp.getNext();
	}

	return -1;
    }

    public int length(){
	int len = 0;
	Node temp = head.getNext();
	while (temp != null){
	    len++;
	    temp = temp.getNext();
	}
	return len;
    }


   public static void main(String args[]){
       LinkedListTail L = new LinkedListTail();
       L.add("hi");
       L.add("wilbur!");
       L.add("rawr");
       
    }
}
