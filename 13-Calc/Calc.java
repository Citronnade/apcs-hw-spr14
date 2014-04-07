import java.util.*;
import java.io.*;

public class Calc{
    public MyStack stack;
    
    public Calc(){
	stack = new MyStack();
    }

    private void checkElements(){
	if (stack.getLength() < 2){
	    int[] a = new int[0]; //too lazy to do exceptions properly, but this will kill it.
	    int b = a[24635748576435267] //arrayoob
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
		    c.push(Integer.parseInt(s));
		}
	    }
	    
	    catch(ArithmeticException e){
		System.out.println("Division by zero."); //triggers either on arithmetic methods or parseInt failure
	    }
	    catch(Exception e){
		System.out.println("Invalid argument");
	    }
	    System.out.println(c.stack);
	}

    }
    


}
