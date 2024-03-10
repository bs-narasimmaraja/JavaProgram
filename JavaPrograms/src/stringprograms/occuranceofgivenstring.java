package stringprograms;

public class occuranceofgivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="I am a developer";
		int count=s1.length()-s1.replace("e","").length();
		System.out.println(count);
	}

}
