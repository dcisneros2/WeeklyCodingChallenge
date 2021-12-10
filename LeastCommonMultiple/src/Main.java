// This is an application that can calculate both GCD and LCM. GCD is found
// through using Euclidean algorithm and LCM is found by using GCD.

public class Main {
	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 2520
		int[] ar2 = { 12, 24, 27, 30, 36 }; // 1080
		int[] ar3 = { 72, 48 }; // 144
		int[] ar4 = { 12, 15, 75 }; // 300

		System.out.printf("Array 1 LCM is %d\n", Lcm(ar1));
		System.out.printf("Array 2 LCM is %d\n", Lcm(ar2));
		System.out.printf("Array 3 LCM is %d\n", Lcm(ar3));
		System.out.printf("Array 4 LCM is %d\n", Lcm(ar4));
	}

	public static int Gcd(int list[]) {
		int gcd = list[0];
		for (int element : list) {
			gcd = EuclidGCD(gcd, element);
		}
		return gcd;
	}

	public static int Lcm(int[] list) {
		int lcm = 1;

		for (int element : list) {
			lcm = Math.abs(lcm * element) / EuclidGCD(lcm, element);
		}

		return lcm;
	}

	public static int EuclidGCD(int big, int small) {
		int remainder = big % small;

		big = small;
		small = remainder;

		if (remainder == 0) {
			return (big == 0) ? small : big;
		}

		return EuclidGCD(big, small);
	}

}
