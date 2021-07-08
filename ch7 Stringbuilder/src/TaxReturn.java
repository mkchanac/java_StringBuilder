
public class TaxReturn {

	private String SSNum;
	private String lastName;
	private String firstName;
	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	private int annualIncome;
	private String martialStatus;
	private double taxLiability;

	public TaxReturn(String sSNum, String lastName, String firstName, String streetAddress, String city, String state,
			String zip, int annualIncome, String martialStatus) {
		SSNum = sSNum;
		this.lastName = lastName;
		this.firstName = firstName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.annualIncome = annualIncome;
		this.martialStatus = martialStatus;
		if (this.annualIncome < 20001) {
			if (this.martialStatus.toLowerCase().equals("single")) {
				this.taxLiability = this.annualIncome * 0.15;
			} else {
				this.taxLiability = this.annualIncome * 0.14;
			}
		} else if (this.annualIncome < 50001) {
			if (this.martialStatus.toLowerCase().equals("single")) {
				this.taxLiability = this.annualIncome * 0.22;
			} else {
				this.taxLiability = this.annualIncome * 0.20;
			}
		} else {
			if (this.martialStatus.toLowerCase().equals("single")) {
				this.taxLiability = this.annualIncome * 0.30;
			} else {
				this.taxLiability = this.annualIncome * 0.28;
			}
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nSocial Security Number: " + SSNum + "\nName: " + firstName + " " + lastName + "\nStreet Address: "
				+ streetAddress + "\nCity: " + city + "\nState: " + state + "\nZip Code: " + zip + "\nAnnual Income: $"
				+ annualIncome + "\nMartial Status: " + martialStatus + "\nTax Liability: " + taxLiability;
	}

}
