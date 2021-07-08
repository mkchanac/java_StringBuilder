import java.util.Arrays;
import java.util.Scanner;

public class Alphabetize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("String 1 >> ");
		String one = input.nextLine();
		System.out.println("String 2 >> ");
		String two = input.nextLine();
		System.out.println("String 3 >> ");
		String three = input.nextLine();

		if (one.toLowerCase().compareTo(two.toLowerCase()) < 0
				&& two.toLowerCase().compareTo(three.toLowerCase()) < 0) {
			System.out.println("It is alphabetical order");
		} else {
			System.out.println("It is not in order");
		}

		
		
		String[] good = {one,two,three};
		
		Arrays.sort(good);
		
		System.out.println(Arrays.toString(good));
		
	}

}
