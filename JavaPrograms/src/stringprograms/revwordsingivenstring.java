package stringprograms;

public class revwordsingivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java is very easy";
		String s2=" ";
		String[] s3=s1.split(" ");
		for(int i=0;i<s3.length;i++) {
			s2+=rev(s3[i]);
			s2+="";
		}System.out.println(s2.trim());
}
	public static String rev(String s) {
		String reverse=" ";
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
		return reverse;
		
	}

}
