import java.util.HashMap;
import java.util.Iterator;

public class ShuffleStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		long a[]= {0, 5, 1, 2, 4, 3};
		/*
		long[] out = new long[n];  
		for(int i=0;i<n;i++) {
			long student_i=a[i];
			for(int j=0;j<n;j++) {
				if(a[j]==i)
				{
					out[j]=student_i;
				}
			}
			
		}
		a=out;
		for(int k=0;k<n;k++) {
		System.out.println(a[k]);
		}
		*/
		 System.out.println(Integer.toBinaryString(8));
		ShuffleStudents ob= new ShuffleStudents();
		ob.prank(a, n);
		System.out.println("inside main method");
		for(int k=0;k<n;k++) {
				System.out.println(a[k]);
			}
		
	}
	 void prank(long[] a, int n)  
	    { 
		 HashMap<Long,Integer> positionmanp=new HashMap();
		for(int i=0;i<n;i++) {
			positionmanp.put(a[i],i);
		}
		//System.out.println(positionmanp.keySet());
		int z=0;
		long[] out1 = new long[n];  
		Iterator itr=positionmanp.keySet().iterator();
		while(itr.hasNext()) {
			long key=(long) itr.next();
			int position=positionmanp.get(key);
			out1[position]=key;
		}
		a=out1;
		//System.out.println("inside prank method");
		for(int h=0;h<n;h++) {
			
			//System.out.println(a[h]);
		}
	}

}
