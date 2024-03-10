package stringprograms;

public class maxoccurancewithoutinbuiltfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="bananaaa";
		char[] ch=s1.toCharArray();
		for(int i=0;i<s1.length();i++) {
			int count=1;
			for(int j=0;j<s1.length();j++) {
				char ch1=ch[i];
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=0;
				}
			}if(ch[i]!=0) {
				System.out.println(ch[i]+ "="+count);
			}
		}
	}

}
