import java.util.ArrayList;
import java.util.Date;

public class PrintPrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M=2, N=2570;
		long d1=System.currentTimeMillis();
		ArrayList<Integer> resarr=new ArrayList();
		for(int i=M;i<=N;i++) {
		 int res=0;
			for(int j=2;j<i/2;j++) {
				
				if(i%j==0 ) {
					//System.out.println("i="+i+" j="+j+" i%j="+i%j);
					res=1;
					break;
				}
			}
			if(res==0 && i!=1 && i!=4) {
				resarr.add(i);
			}
			
			
		}
		long d2=System.currentTimeMillis();
		
		System.out.println(d2-d1);
		System.out.println(resarr.size()+" "+resarr);

	}

}
