import java.util.Scanner;

public class PhoneNumberFormat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String user = "";
		StringBuilder phoneNum = new StringBuilder();

		while (user != "999") {
			System.out.println("Enter 10 digits phone number >> ");
			phoneNum = new StringBuilder(input.nextLine());

			if (phoneNum.length() != 10) {
				System.out.println("Error, it is not 10 digits");
				user = "999";
			} else {

				phoneNum.insert(0, '(');
				phoneNum.insert(4, ')');
				phoneNum.insert(5, ' ');
				phoneNum.insert(9, '-');
				System.out.println(phoneNum);

				System.out.println("Enter 999 to quit, or press any key to continue...");
				user = input.nextLine();
			}
		}
	}

}
