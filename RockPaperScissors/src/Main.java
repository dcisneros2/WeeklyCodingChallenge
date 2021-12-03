
public class Main {
	public static void main(String[] args) {
		System.out.println(rpsGame("rock", "rock"));
		System.out.println(rpsGame("rock", "paper"));
		System.out.println(rpsGame("rock", "scissors"));
		System.out.println(rpsGame("paper", "paper"));
		System.out.println(rpsGame("paper", "ROCK"));
		System.out.println(rpsGame("paper", "scissors"));
		System.out.println(rpsGame("scissors", "scissors"));
		System.out.println(rpsGame("SCISSORS", "paper"));
		System.out.println(rpsGame("SCISSORS", "ROCK"));
	}

	public static String rpsGame(String p1, String p2) {

		p1 = p1.toLowerCase();
		p2 = p2.toLowerCase();

		switch (p1) {

		case "rock":
			if (p2.equals("rock"))
				return "Tie";
			else if (p2.equals("paper"))
				return "P2 Wins";
			else
				return "P1 Wins";

		case "paper":
			if (p2.equals("paper"))
				return "Tie";
			else if (p2.equals("rock"))
				return "P1 Wins";
			else
				return "P2 Wins";

		case "scissors":
			if (p2.equals("scissors"))
				return "Tie";
			else if (p2.equals("paper"))
				return "P1 Wins";
			else
				return "P2 Wins";

		default:
			return "try again";

		}
	}
}
