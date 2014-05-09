public class BinSearchTree{
    Node root;

    // public Node search(int x){
    // 	Node temp = root;
    // 	while (temp != null && temp.getData() != x){
    // 	    if (temp.getData() < x){
    // 		temp = temp.getRight();
    // 	    }
    // 	    else{
    // 		temp = temp.getLeft();
    // 	    }
    // 	}
    // 	return temp;
    // }

    public BinSearchTree(){
	root = null;
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

    public Node search2(Node c, int x){
	if (c == null || c.getData() == x){ //pls short circuit ty
	    return c;
	}

	else{
	    if (c.getData() < x){ //need to move left
		return search2(c.getLeft(), x);
	    }
	    else{
		return search2(c.getRight(), x);
	    }
	}
    }
}
