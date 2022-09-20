package First;

public class FlamesV2 {
public static void main(String[] args) {
	String a="karthikeyan ";
	String b="abinaya ";
    int result=flames(a,b);
    System.out.println(result);
    int result1=flames(b,a);
    System.out.println(result1);
    int res=result+result1;
    System.out.println(res);
    String s="FLAMES";
    int q=s.length();
    
    for(int i=s.length();i>=2;i--) {
       if(res>=6) {
    	   int r=res%i;
    	  s=finding(r,i,s);
    	 }
    }
	System.out.println(s);
}
public static int flames(String a,String b) {
	int add=0;
	int j=-1;
	for(int i=1;i<=a.length();i++) {
		j++;
		if(b.contains(a.substring(j,i))) {
			int k=b.indexOf(a.substring(j,i));
			//b=b.replaceAll(a.substring(k,k+1),"");
			b=charRemoveAt(b,k);
		}else { add++;}}
return add;	
}
/*public static int flames1(String a,String b) {
	int add=0;
	int j=-1;
	for(int i=1;i<a.length();i++) {
		j++;
		if(b.contains(a.substring(j,i))) {
			int k=b.indexOf(a.substring(j,i));
			//b=b.replaceAll(a.substring(k,k+1),"");
			b=charRemoveAt(b,k);
		}else { add++;}}
	int c=b.length();
return c;	
}*/

private static String charRemoveAt(String b, int k) {
	return b.substring(0, k) + b.substring(k + 1);
}
private static String charRemoveAt1(String s, int m) {
	return s.substring(m+1) + s.substring(0,m);
}
public static String finding(int r,int i,String s) {
if(i==6) {
if(r==0) {
	  return charRemoveAt1(s,i-1);
}else if(r==5) {
	 return charRemoveAt1(s,i-2);
}else if(r==4) {
	 return  charRemoveAt1(s,i-3);
}else if(r==3) {
	 return charRemoveAt1(s,i-4);
}else if(r==2) {
	 return  charRemoveAt1(s,i-5);
}else if(r==1) {
	 return  charRemoveAt1(s,i-6);
}}else if(i==5) {
	if(r==0) {
		 return  charRemoveAt1(s,i-1);
	}else if(r==4) {
		 return  charRemoveAt1(s,i-2);
	}else if(r==3) {
		 return charRemoveAt1(s,i-3);
	}else if(r==2) {
		 return charRemoveAt1(s,i-4);
	}else if(r==1) {
		 return  charRemoveAt1(s,i-5);
	}}else if(i==4) {
		if(r==0) {
			 return   charRemoveAt1(s,i-1);
		}else if(r==3) {
			 return  charRemoveAt1(s,i-2);
		}else if(r==2) {
			 return  charRemoveAt1(s,i-3);
		}else if(r==1) {
			 return charRemoveAt1(s,i-4);
		}}else if(i==3) {
			if(r==0) {
				 return   charRemoveAt1(s,i-1);
			}else if(r==2) {
				   return charRemoveAt1(s,i-2);
			}else if(r==1) {
				 return charRemoveAt1(s,i-3);
			}}else if(i==2) {
				if(r==0) {
					 return  charRemoveAt1(s,i-1);
				}else if(r==1) {
					 return charRemoveAt1(s,i-2);
				}}
return s;
}
}
