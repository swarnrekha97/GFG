import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a[]= {1,2,4,3,5};
		long sum=maximizeSum(a,5,5);
		System.out.println(sum);
	}
	
	 public static long maximizeSum(long a[], int n, int k)
	    {
	        // Your code goes here 
		List<Long> negativelist=new ArrayList();
		List<Long> positivelist=new ArrayList();
		long sum=0;
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				negativelist.add(a[i]);
			}
			else
			{
			sum+=a[i];
			positivelist.add(a[i]);
			}
		}
		
		Collections.sort(negativelist);
		Collections.sort(positivelist);
		System.out.println(negativelist);
		System.out.println(positivelist);
		int listsize=negativelist.size();
		int index=0;
		while(k>0) {
			if(listsize!=0 && index<listsize) {
			sum+=(-negativelist.get(index));
			}
			k--;
			index++;
		}
		return sum;
	    }

}
