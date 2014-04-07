public class MyStack{

    private Node top;
    public MyStack(){
	top = null;
    }
    //push 2
    public void push(String n){
	Node temp = new Node(n);
	temp.setNext(top);
	top = temp;
    }

    public String pop(){
	String s = top.getData();
	top = top.getNext(); //java style involves throwing exceptions then catching later
	return s;
	
    }

    
    //pop
    public String peek(){
	return top.getData();
    }
    //peek

    //isEmpty

    public boolean isEmpty(){
	return top == null;
    }
    // toString 3
    public String toString(){
	String s = "";
	for (Node temp = top; temp != null; temp = temp.getNext()){
	    s+=temp.getData() + ", ";
	}
	return s;
    }

    public static void main(String[] args){
	MyStack stack = new MyStack();
	stack.push("1");
	stack.push("2");
	stack.push("3");
	System.out.println(stack);
	while(!stack.isEmpty()){
	    System.out.println(stack.pop());
	}
	stack.push("hello");
	System.out.println(stack.peek());
	System.out.println(stack.pop());
	System.out.println(stack.peek());

    }
}
