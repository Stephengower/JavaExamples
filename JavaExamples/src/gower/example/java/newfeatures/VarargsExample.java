package gower.example.java.newfeatures;

import java.util.function.IntPredicate;

public class VarargsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray={1,2,3};
		//passing traditional array
		System.out.println("total="+total(intArray));
		
		//passing element list directly - only possible using 
		//a method definted with a varargs signature
		System.out.println("total="+total(1,2,3,4));
	}

	
	
	public static int total(int...numbers){
		int total=0;
		for(int element:numbers){
			total+=element;
		}
		return total;
	}
}
