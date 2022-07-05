import java.util.ArrayList;

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A= {11, 42, 49, 96, 23, 20, 49, 26, 26, 18, 73, 2, 53, 59, 34, 99, 25, 2};//{100,130,260,310,40,535,695};   //
		int n=18;
		
		 int min=A[0];
	        int max=A[0];
	        int minindex=0;
	        int maxindex=0;
	        ArrayList<ArrayList<Integer>> reslist=new ArrayList<>();
	        ArrayList<Integer> buyselllist=new ArrayList<>();
	        for(int i=0;i<n;i++){
	        	 System.out.println(min +" "+max+" "+A[i]);
	            if(A[i]<min ){
	            	if(i!=1) {
	                buyselllist.add(minindex);
	                 buyselllist.add(maxindex);
	                 reslist.add(buyselllist);
	                 System.out.println("added "+buyselllist);
	                buyselllist=new ArrayList<>();
	            	}
	                min=A[i];
	                minindex=i;
	                maxindex=i;
	                max=A[i];
	            }
	            else if(A[i]>max)
	            {
	            max=A[i];
	            maxindex=i;
	            }
	           
	            
	        }
	        if(max>min) {
	        buyselllist.add(minindex);
	        buyselllist.add(maxindex);
	        reslist.add(buyselllist);
	        }
	        System.out.println(reslist);
	        
	        
	}

}
