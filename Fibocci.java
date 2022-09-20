package First;

public class Fibocci {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int c=0;
	System.out.println(a+"\n"+b);
	for(int i=3;i<=10;i++) {
		c=a+b;
		System.out.println(c);
	//	b=c;
		a=b;
		b=c;
	}
}
}
