
public class CountSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String favourite = "Hello Wo rld !";
		int length = favourite.length();
		System.out.println(length);
		
		String[] splitBySpace = favourite.split(" ");
		int numOfSpace = splitBySpace.length-1;
		System.out.println(numOfSpace);
		

	}

}
