package stringprograms;

public class reveresethestring {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; int j=s1.length-1;
		String s1="developer";
		char[] ch=s1.toCharArray();
		while(i<j) {
			int temp=ch[i];
			ch[i]=ch[j];
			ch[j]=(char) temp;
		}System.out.println(ch);
	}
	}
