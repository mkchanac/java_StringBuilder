import java.util.Scanner;

public class PrepareTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssNum = enterInfo("Social Security Number");
		String lName = enterInfo("Last Name");
		String fName = enterInfo("First Name");
		String sAdd = enterInfo("Street Address");
		String city = enterInfo("City");
		String state = enterInfo("State");
		String zip = enterInfo("ZIP code");
		String anIn = enterInfo("Annual income");
		String martial = enterInfo("Martial Status");
		int annualIncome = Integer.parseInt(anIn);

		TaxReturn user = new TaxReturn(ssNum, lName, fName, sAdd, city, state, zip, annualIncome, martial);
		System.out.println(user);

	}

	public static String enterInfo(String info) {
		Scanner input = new Scanner(System.in);
		String output = "";

		if (info == "Social Security Number") {
			System.out.println("Enter your " + info + ": ");
			output = input.nextLine();
			while (output.charAt(3) != '-' || output.charAt(6) != '-') {
				System.out.println("Enter your " + info + " (999-99-9999): ");
				output = input.nextLine();
			}
		} else if (info == "ZIP code") {
			System.out.println("Enter your " + info + ": ");
			output = input.nextLine();
			while (output.length() != 5) {
				System.out.println("Enter your " + info + " (5 digits only): ");
				output = input.nextLine();
			}
		} else if (info == "Martial Status") {
			System.out.println("Enter your " + info + ": ");
			output = input.nextLine();
			while (!(output.startsWith("s")) && !(output.startsWith("S")) && !(output.startsWith("m")) && !(output.startsWith("M"))) {
				System.out.println("Enter your " + info + " (Single or Married only): ");
				output = input.nextLine();
			}
		} else if (info == "Annual income") {
			System.out.println("Enter your " + info + ": ");
			output = input.nextLine();
			while (Integer.parseInt(output) < 0) {
				System.out.println("Enter your " + info + " (positive only): ");
				output = input.nextLine();
			}
		} else {
			System.out.println("Enter your " + info + ": ");
			output = input.nextLine();
		}

		return output;

	}

}
