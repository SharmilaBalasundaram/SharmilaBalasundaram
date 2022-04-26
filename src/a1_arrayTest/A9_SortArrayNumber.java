package a1_arrayTest;

import java.util.Arrays;

public class A9_SortArrayNumber {
	
	public static void main(String[] args) {
		
		int [] a= new int[5];
		
		a[0]=10;
		a[1]=5;
		a[2]=9;
		a[3]=8;
		a[4]=1;
		
		Arrays.sort(a);
		for (int i=0;i<5;i++){
		System.out.println(a[i]);
		}
		
		
	}

}
