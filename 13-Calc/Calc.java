import java.util.*;
import java.io.*;

//TURNS OUT DIVIDING BY ZERO DOESN'T THROW EXCEPTIONS

public class Calc{
    public MyStack stack;
    
    public Calc(){
	stack = new MyStack();
    }

    private void checkElements(){
	if (stack.getLength() < 2){
	    int[] a = new int[0]; //too lazy to do exceptions properly, but this will kill it.
	    int b = a[2463567]; //arrayoob
	}
    }

    private double add(){
	checkElements();
	return stack.push(stack.pop()+stack.pop());
    }

    private double push(double a){
	return stack.push(a);
    }
    
    private double subtract(){
	checkElements();
	return stack.push(-stack.pop() + stack.pop()); //in order to maintain correct order
    }

    private double multiply(){
	checkElements();
	return stack.push(stack.pop()*stack.pop());
    } 
    
    private double divide(){
	if (stack.peek() == 0){
	    int a =  5 / 0; //throws exception
	}
	checkElements();
	return stack.push((1/stack.pop()) * stack.pop());
    }

    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	//	String s = sc.nextLine();
	Calc c = new Calc();
	String s;
	while (true){ //quit
	    s = sc.nextLine();
	    if (s.equals("q")){
		break;
	    }
	    try{
		if (s.equals("+")){
		    System.out.println(c.add());
		}
		else if (s.equals("-")){
		    System.out.println(c.subtract());
		}
		else if (s.equals("*")){
		    System.out.println(c.multiply());
		}
		else if (s.equals("/")){
		    System.out.println(c.divide());
		}
		else{
		    c.push(Float.parseFloat(s));
		}
	    }
	    
	    catch(ArithmeticException e){
		System.out.println("Division by zero."); 
	    }
	    catch(Exception e){
		System.out.println("Invalid argument");  //triggers either on arithmetic methods or parseInt failure
	    }
	    System.out.println(c.stack);
	}

    }
    


}
