package stringprograms;

public class sumofnumberingivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ab21bdj39dnb3";
		char[] a=s1.toCharArray();
		int sum=0;
		int i=0;
		while(i<a.length) {
			if(a[i]>='0' && a[i]<='9') {
				String s2=" ";
				s2+=a[i];
				i++;
				while(i<a.length && a[i]>='0'&& a[i]<='9') {
					s2+=a[i];
					i++;
				}
				sum+=Integer.parseInt(s2);
			}
			i++;
			System.out.println(sum);
		}
	}

}
