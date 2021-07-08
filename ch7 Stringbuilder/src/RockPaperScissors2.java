import java.util.Random;
import java.util.Scanner; //p.392

public class RockPaperScissors2 {
//p>r>s
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] computer = { "r", "p", "s" };
		Random guess = new Random();

		Scanner input = new Scanner(System.in);
//		System.out.println("Enter rock/paper/scissors: ");
//		String entry = input.nextLine().toLowerCase();

		int won = 0;
		int lost = 0;
		int tied = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("Enter rock/paper/scissors: ");
			StringBuilder entry = new StringBuilder(input.nextLine().toLowerCase());

			while ((entry.length() < 2) || !((entry.substring(0, 2).equals("ro") || entry.substring(0, 2).equals("pa")
					|| entry.substring(0, 2).equals("sc")))) {
				System.out.println("Invalid Entry, re-enter again (rock/paper/scissors): ");
				entry = new StringBuilder(input.nextLine().toLowerCase());
			}

			String comR = computer[guess.nextInt(3)];

			if (entry.substring(0, 1).equals(comR)) {
				tied++;
			} else {
				if (entry.substring(0, 1).equals("p")) {
					if (comR.equals("r")) {
						won++;
					} else {
						lost++;
					}
				} else if (entry.substring(0, 1).equals("r")) {
					if (comR.equals("s")) {
						won++;
					} else {
						lost++;
					}
				} else {
					if (comR.equals("p")) {
						won++;
					} else {
						lost++;
					}
				}

			}

		}

		System.out.println("Player wins " + won + " games");
		System.out.println("Computer wins " + lost + " games");
		System.out.println(tied + " games tied");
	}

}
