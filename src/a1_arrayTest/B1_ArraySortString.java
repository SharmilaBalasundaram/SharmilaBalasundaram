package a1_arrayTest;

import java.util.Arrays;

public class B1_ArraySortString {
	
	public static void main(String[] args) {
		
		String [] s=new String[5];
		s[0]="Sharmila";
		s[1]="Rahul";
		s[2]="Raju";
		s[3]="Pavithra";
		s[4]="Prabhakaran";

		Arrays.sort(s);
		
		for (int i=0;i<5;i++){
			System.out.println(s[i]);
		}
		
	}

}
