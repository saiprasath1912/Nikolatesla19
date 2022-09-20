package First;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int count=0;
		int count1=0;
		for(int i=2;i<=500;i++) {
			/*if(num%i==0) {
				j=j+1;
			}*/
			for(int j=i+1 ;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				count1++;
				if(count1==10) {
					//System.out.println(i);
				System.out.println(i);
				}
			}
			
		}
		/*if(j==2) {
			System.out.println("PRIME NUMBER");
		}else {System.out.println("NOT PRIME NUMBER");}*/
		
	}}


