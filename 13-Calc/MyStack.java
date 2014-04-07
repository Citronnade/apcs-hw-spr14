public class MyStack{

    private double[] elements;
    private int numElements;

    public MyStack(){
	elements = new double[10];
	numElements = 0;
    }
    //push 2

    public double[] getElements(){
	return elements;
    }

    public int getLength(){
	return numElements;
    }

    private void expand(){
	int newLength = (int)( elements.length * 1.5);
	double[] temp = new double[newLength];
	for (int i = 0;  i < elements.length; i++){
	    temp[i] = elements[i];
	}
	elements = temp;
    }

    public double push(double n){
	if (numElements == elements.length){ //stack full
	    expand();
	}
	//Node temp = new Node(n);
	elements[numElements] = n;
	numElements++;
	return n;
    }

    public double pop(){
	double temp = elements[numElements-1]; //throws oob if numElements = 0
	elements[numElements-1] = 0; //shouldn't matter but
	numElements--;
	return temp;
    }

    
    //pop
    public double peek(){
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

}
