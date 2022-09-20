package First;

public class Identification {
	public static void main(String[]args) {
		String a="PRakasH MenTAL";
		char[] b=a.toCharArray();
		int q= a.length();
		String total1 ="";
		String total2="";
		for(int i=0; i<q; i++) {
			int n=b[i];
			boolean c=(n>=65&&n<=90);
			if(c==true){
				total1=total1+" "+b[i];
	
				}
			else
			{
				total2=total2+" "+b[i];
			}
		}
		System.out.println("UPPER CASE ="+total1);
		System.out.println("LOWER CASE ="+total2);
	}
	
}
