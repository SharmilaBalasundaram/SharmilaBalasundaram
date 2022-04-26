package a1_arrayTest;

public class A4_ToGetAllArrayData {

	public static void main(String[] args) {

		int[] a = new int[5];
		a[0] = 10;
		a[1] = 100;
		a[2] = 100;
		a[3] = 1000;
		a[4] = 10000;

		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

		int[] b = { 10, 20, 30, 40, 50, 60, 70, 80 };

		System.out.println(b.length);

		for (int i = 0; i < b.length; i++) {

			System.out.println(b[i]);
		}

	}

}
