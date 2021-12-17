
public class Main {
	public static void main(String[] args) {
		System.out.println(waysToClimb(5 + 1));
		System.out.println(waysToClimb(4 + 1));
		System.out.println(waysToClimb(3 + 1));
	}

	public static int waysToClimb(int n) {
		if (n <= 1) {
			return n;
		} else
			return waysToClimb(n - 2) + waysToClimb(n - 1);
	}
}
