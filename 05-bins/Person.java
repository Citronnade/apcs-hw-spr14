public class Person implements Comparable<Person>{
    private int age;
    private String name;
    
    public int getAge(){
	return age;
    }

    public String getName(){
	return name;
    }

    public String toString(){
	return "Name: " + name + ", age: " + age;
    }

    public Person(int age, String name){
	this.age = age;
	this.name = name;
    }

    public Person(){
	this((int) (Math.random()*100), "Bob");
    }

    public int compareTo(Person o){
	if (!(o instanceof Person)){
	    throw new ClassCastException();
	}
	//if (this.getAge() > o.getAge()){
	if (this.age > o.age){
	    return 1;
	}
	if (this.age < o.age){
	    return -1;
	}
	else{
	    return name.compareTo(o.name);
	}

    }
}
