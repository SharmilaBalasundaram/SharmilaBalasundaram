package a1_arrayTest;

public class A2_ObjectArrayTest {
	
	public static void main(String[] args) {
		
		Object [] a= new Object[5];
		a[0]=100; // int
		a[1]='a'; // char
		a[2]="Java"; // string
		a[3]= true; // boolean
		a[4]=1.5; // double
		
		for (int i=0;i<5;i++){
		System.out.println(a[i]);
		}
		
		
		
	}

}
