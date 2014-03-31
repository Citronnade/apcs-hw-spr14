import java.util.*;

public class LinkedListIterator<E> implements Iterator<E>{
    private Node currentNode;
   
    public LinkedListIterator(Node n){
	currentNode = n;
	currentNode = currentNode.getNext(); //head is null
	
    }

    public boolean hasNext(){
	return currentNode.getNext() == null;
    }
    
    public E next(){
	Node current = currentNode;
	if (currentNode == null){ // at tail dummy value
	    throw new NoSuchElementException();
	}
	currentNode = currentNode.getNext(); //increment
	   
	return current;
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }

 
}
