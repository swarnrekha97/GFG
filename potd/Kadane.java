import java.util.Iterator;
import java.util.TreeMap;

public class Kadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]res=new int[4][2];
		
		 TreeMap<Integer,Integer> intervalmap=new TreeMap();
		Iterator itr= intervalmap.keySet().iterator();
		//int [] arr= {-1,2,3,-2,-1};
		int [] arr= {-1,2,3,-2,10};
		
		int sum=arr[0];
		
		int newsum=0;
		
		for(int i=0;i<arr.length;i++) {
			newsum=newsum+arr[i];
			
			if(newsum>sum) {
				sum=newsum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		
		System.out.println(sum);
	}

}
