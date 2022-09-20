package First;

public class Test {
public static void main(String[] args) {
	int a=0;
	int b=1;
	String s="saiprasath";
	int j=1;
	int k=0;
	int add=0;
	for(int i=0;i<s.length()-1;i++) {
		k++;
		if((s.substring(j,s.length())).contains(s.substring(i,j))) {
			add++;
			String q=s.substring(j,s.length());
			a=q.indexOf(s.substring(i,j))+j;
			System.out.println(a);
			if(k==1) {b=a;}
			if(a<b) {b=a;}
			j++;
		}else{}}
	System.out.println(add);
	//if(b>0) {System.out.println(b);}
	//else {System.out.println("NO CHARACTER HAS SECOND OCCURRENCE");}
}
}
