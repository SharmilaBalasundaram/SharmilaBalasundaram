package a1_arrayTest;

public class A7_SwapArrayTask {

	public static void main(String[] args) {
		
		int [] a= new int[5];
		a[0]=30;
		a[1]=10;
		a[2]=40;
		a[3]=50;
		a[4]=20;
		
		System.out.println("Before swaping array:");
		for (int i=0;i<a.length;i++){
		System.out.println(a[i]);
		}
		
		System.out.println();
		System.out.println("After swaping an array:");
		
		int [] temp = new int [5];
		temp[0]=a[1];
		temp[1]=a[2];
		temp[2]=a[3];
		temp[3]=a[4];
		temp[4]=a[0];
 
		for (int i=0;i<a.length;i++){
			System.out.println(temp[i]);
			}
		
		
		
	}
	
}
