package First;

public class Count {
public static void main(String[] args) {
	String a="ublanj&156";
	char[] b=a.toCharArray();
	int u=0;
	int l=0;
	int n=0;
	int s=0;
	int j=0;
	for(int i=0;i<a.length();i++) {
		j++;
		if(b[i]>='A' && b[i]<='Z') {
			u++;
		}else if(b[i]>='a' && b[i]<='z') {
			l++;
		
		
		}else if(b[i]>='!' && b[i]<='@') {
			if(b[i] >='0' && b[i]<='9') {
				n++;
			}else {
			s++;}
		}
	}
	System.out.println(u+" "+l+" "+n+" "+s);
}
}
