package gower.example.java.newfeatures;

//based upon http://www.tutorialspoint.com/java/java_generics.htm

import javax.management.loading.PrivateClassLoader;

public class GenericClass<T> {

	private T t;
	//test  2
	public void add(T t){
		this.t=t;
	}
	
	public T get(){
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer> integerBox=new GenericClass<Integer>();
		GenericClass<String> stringBox=new GenericClass<String>();
		
		integerBox.add(new Integer(555));
		stringBox.add("Hello!");
		
		System.out.println("integerBox result="+integerBox.get());
		System.out.println("stringBox result="+stringBox.get());
	}
}
