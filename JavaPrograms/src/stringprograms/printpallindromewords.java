package stringprograms;

public class printpallindromewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam sir madam sis";
		String[] s1=s.split("");
		for(int i=0;i<s1.length;i++)
		{
			if(ispallindrome(s1[i]));
			
		}
	}

	public static boolean ispallindrome(String s) {
		// TODO Auto-generated method stub
		int i=0; int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
			return false;
			
			i++;
			j--;
		
		}
		return true;
	}

}
