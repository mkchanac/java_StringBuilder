import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		StringBuilder word = new StringBuilder(input.nextLine());

		if (word.charAt(0) == 'y') {
			char temp = word.charAt(0);
			word.deleteCharAt(0);
			word.append(temp);
			word.append('a');
			word.append('y');
			System.out.println(word);
		}

		else if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o'
				|| word.charAt(0) == 'u') {
			word.append('a');
			word.append('y');
			System.out.println(word);
		} else {
			boolean quit = false;
			char temp;
			while (!quit) {
				for (int i = 0; i < word.length(); i++) {
					if (word.charAt(0) != 'a' && word.charAt(0) != 'e' && word.charAt(0) != 'i' && word.charAt(0) != 'o'
							&& word.charAt(0) != 'u' && word.charAt(0) != 'y') {
						temp = word.charAt(0);
						word.deleteCharAt(0);
						word.append(temp);
					} else {
						quit = true;
					}
				}
			}

			word.append('a');
			word.append('y');
			System.out.println(word);
		}

	}

}
