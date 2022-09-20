package First;

public class Test2 {

	public static void main(String[] args) {
		String a="";
		String b="";
		String c="";
		int j=0;
		for(int i=0;i<a.length();i++) {
			j++;
			c=a.substring(0, i) + a.substring(i + 1);
			if(c.contains(a.substring(i,j))){
				continue;
			}else {b=b+a.substring(i,j);}}
		
		System.out.println(b);
	}}
