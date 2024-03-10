package stringprograms;

public class stringinitcapprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="valkonda chandra sekara venkata ramana kumar goad";
		char[] ch=s1.toCharArray();
		for(int i=0;i<s1.length();i++) {
			char ch1=ch[i];
			if(ch1>='a' && ch1<='z') {
				if(i==0|| ch[i-1]==' ') {
					ch[i]=(char) (ch[i]-32);
				}
			}
		}System.out.println(ch);
	}

}
