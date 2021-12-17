class Main {
	public static void main(String[] args) {
		almostPalindrome("abcdcbg");
		almostPalindrome("abccia");
		almostPalindrome("abcdaaa");
		almostPalindrome("1234312");
	}

	public static boolean almostPalindrome(String str) {

		int diff = 0;
		StringBuilder sb = new StringBuilder();
		StringBuilder charDiff = new StringBuilder();

		sb.append(str);
		sb.reverse();

		for (int i = 0; i < sb.length(); i++) {
			if (str.charAt(i) == sb.charAt(i)) {
			} else {
				if (diff <= 2) {
					diff++;
					charDiff.append(str.charAt(i));
					charDiff.append(sb.charAt(i));
				} else {
					System.out.println("false");
					return false;
				}
			}
		}

		if (diff == 0) {
			System.out.println("Palindrome!");
			return true;
		} else {
			System.out.printf("\"%s\" true -> by changing \"%c\" to \"%c\"\n", str, charDiff.charAt(1),
					charDiff.charAt(0));
			return true;
		}
	}
}
