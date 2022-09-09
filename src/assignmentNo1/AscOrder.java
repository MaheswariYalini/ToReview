package assignmentNo1;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
import java.util.Scanner;

public class AscOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array");
		int a[] = new int[20];
		int i;
		int n = scan.nextInt();
		for (i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();

		// aSCENDING ORDER
		for (i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Ascending Order");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

		// Descending Order
		for (i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Descending Order");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

		/*
		 * List<Integer> l=new ArrayList<Integer>(); l.add(12); l.add(4); l.add(22);
		 * l.add(10); l.add(156); l.add(1); l.add(0);
		 * 
		 * Collections.sort(l); System.out.println(l); Collections.reverse(l);
		 * System.out.println(l);
		 */
		/*
		 * i=10; while( i>0) { System.out.println(i); i--; }
		 */
			
		}
	}


