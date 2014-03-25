

public class MyLinkedList{
    private Node head;

    public MyLinkedList(){
	head = new Node("dummy");
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

    public void add (String d){
	Node add = new Node(d);
	Node temp = head;
	while (temp.getNext() != null){
	    temp = temp.getNext();
	}
	temp.setNext(add);//adds to the end
    }

    public void add(int i, String s){
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

    public String set(int i, String s){
	Node prev = head;
	Node temp = head.getNext();
	Node change = new Node(s);
	int j = 0;
	while (temp != null){
	    if (i == j){
		change.setNext(temp.getNext());
		prev.setNext(change);
		return temp.getData();
	    }
	    prev = temp;
	    temp = temp.getNext();
	    j++;
	}
	return null;
    }
    
    public String remove(int i){
	Node prev = head;
	Node temp = head.getNext();
	int j = 0;
	while (temp != null){
	    if (i == j){
		prev.setNext(temp.getNext());
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

}
