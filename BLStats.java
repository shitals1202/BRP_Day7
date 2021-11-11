package classwork.Day7;

import java.util.Scanner;

public class BLStats {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the total numbers: ");
		int n = sc.nextInt();
		Double a[] = new Double[n];
		System.out.println("Enter numbers: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextDouble();
		}
		largestValue(n, a);
		smallestValue(n, a);

	}

	private static void smallestValue(int n, Double[] a) {
		Double d1 = 0.0;
		for (int i = 0; i < n - 1; i++) {
			d1 = Double.min(a[i], a[i + 1]);
			a[i + 1] = d1;
		}
		System.out.println("Minimum value: " + d1);
	}

	private static void largestValue(int n, Double[] a) {

		Double d1 = 0.0;
		for (int i = 0; i < n - 1; i++) {
			d1 = Double.max(a[i], a[i + 1]);
			a[i + 1] = d1;
		}
		System.out.println("Maximum value: " + d1);
		sc.close();
	}

}