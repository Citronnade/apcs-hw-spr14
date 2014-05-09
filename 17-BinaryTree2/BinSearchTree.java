public class BinSearchTree{
    Node root;

    public Node search(int x){
    	Node temp = root;
    	while (temp != null && temp.getData() != x){
    	    if (temp.getData() < x){
    		temp = temp.getRight();
    	    }
    	    else{
    		temp = temp.getLeft();
    	    }
    	}
    	return temp;
    }

    public BinSearchTree(){
	root = null;
    }

    public boolean remove(int x){
	Node temp = root;
	Node p = temp;
	while (temp != null && temp.getData() != x){
	    if (temp.getData() < x){
		p = temp;
		temp = temp.getRight();		
	    }
	    else{
		p = temp;
		temp = temp.getLeft();
	    }
	}
	if (temp = null){
	    return false;
	}
	
	if (temp.getLeft == null){
	    if (temp.getRight != null){
		prev.setNext(temp.getRight());
	    }
	    else{
		prev.setNext(temp.getLeft());
	    }
	}
	else if (temp.getRight == null){
	    prev.setNext(temp.getLeft());
	}
	else{
	    temp2 = temp.getLeft().getRight();
	    remove(temp2.getValue());
	    temp = temp2;
	}
	return true;
    }

    public Node insert(Node n){ //oops I didn't use prev at all
	Node temp = root;
	Node prev = root;
	
	while (true){
	    if (temp.getData() < n.getData()){ //node should go to the right
		if (temp.getRight() == null){ //empty
		    temp.setNext(n);
		    break; //leave loop
		}
		else{ //not empty, keep going
		    prev = temp;
		    temp = temp.getRight();
		}
	    }
	    else if (temp.getData() > n.getData()){ //node should go to the left
		if (temp.getLeft() == null){ //empty
		    temp.setNext(n);
		    break; //leave loop
		}
		else{ //not empty, keep going
		    prev = temp;
		    temp = temp.getLeft();
		}
	    }
	    else{
	        return null; //not including duplicate nodes.
	    }
	}
	return temp; //not sure which node to return
    }
}
