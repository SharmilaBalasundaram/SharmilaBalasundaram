package a1_arrayTest;

public class A3_EmptyArray {
	
	public static void main(String[] args) {
		
		int [] a = new int[5];
		a[0]=10;
		
		for (int i=0;i<5;i++){
		System.out.println(a[i]);
		}
		
		/************************************/
		
		String [] b = new String[5];
		b[1]="Sharmu"; // assigned value for II index
		
		for (int i=0;i<5;i++){
			System.out.println(b[i]);
			}
		
		/************************************/
		
		boolean [] c = new boolean[5];
		c[2]=true;
		c[3]= false;
		
		for (int i=0;i<5;i++){
			System.out.println(c[i]);
			}

		/************************************/

		char [] d = new char[5];
		d[2]='s';
		d[3]= 'm';
		
		for (int i=0;i<5;i++){
			System.out.println(d[i]);
			}
		 
				

		
		
	}

}
