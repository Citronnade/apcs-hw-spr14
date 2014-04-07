public class MyStack{

    private Node top;
    private String[] elements;
    private int numElements;

    public MyStack(){
	top = null;
	elements = new String[10];
	numElements = 0;
    }
    //push 2
    private void expand(){
	int newLength = (int)( elements.length * 1.5);
	String[] temp = new String[newLength];
	for (int i = 0;  i < elements.length; i++){
	    temp[i] = elements[i];
	}
	elements = temp;
    }

    public void push(String n){
	if (numElements == elements.length){ //stack full
	    expand();
	}
	//Node temp = new Node(n);
	elements[numElements] = n;
	numElements++;
    }

    public String pop(){
	String temp = elements[numElements-1]; //throws oob if numElements = 0
	elements[numElements-1] = "";
	numElements--;
	return temp;
    }

    
    //pop
    public String peek(){
	return elements[numElements-1];
    }
    //peek

    //isEmpty

    public boolean isEmpty(){
	return numElements == 0;
    }
    // toString 3
    public String toString(){
	String s = "";
	for (int i = 0; i < numElements; i++){
	    s+= elements[i] + ", ";
	}
	return s;
    }

    public static void main(String[] args){
	MyStack stack = new MyStack();
	stack.push("1");
	stack.push("2");
	stack.push("3");
	stack.push("4");
	stack.push("5");
	stack.push("6");
	stack.push("7");
	stack.push("8");
	stack.push("9");
	stack.push("10");
	System.out.println(stack);
	stack.push("11");
	stack.push("12");
	System.out.println(stack);
	while(!stack.isEmpty()){
	    System.out.println(stack.pop());
	}
	stack.push("hello");
	System.out.println(stack.peek());
	System.out.println(stack.pop());
	System.out.println(stack.peek()); //should throw oob

    }
}
