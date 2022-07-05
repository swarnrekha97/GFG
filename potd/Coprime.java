
public class Coprime {
public static void main(String[] args) {
	
	
	long m= 5;
	long n=6;
	
	long min=Math.min(m, n);

		for(long i=min;i>=1;i--) {
			if(m%i==0 && n%i==0) {
				m=m/i;
				n=n/i;
			}
		}
		
		System.out.println(m+n);
		
		
		int i=546;
		
		 int length = String.valueOf(i).length();
		 
		 System.out.println(String.valueOf(i).charAt(1));
	
}
}
