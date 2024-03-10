package stringprograms;

public class minoccuranceinstring {

	public static void main(String[] args) {
		// TODO Ato-generated method stub
		String s1="bananann";
		int min=s1.length();
		char ch2=' ';
		while(s1.length()>0) {
			char c=s1.charAt(0);
			String s2=s1.replace(c+"", "");
			int count=s1.length()-s2.length();
			if(count<min) {
			min=count;
			ch2=c;
			}s1=s2;
		}System.out.println(ch2+ "="+min);
	}

}
