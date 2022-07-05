import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OverlappingSlots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A= {1, 3, 7, 9, 9};
		int[] B= {5, 6, 8, 9, 10};
		 List<String> overlapping=new ArrayList();
		 Map<Integer,Integer> ovelappingmap=new HashMap();
	        List<String> nonoverlapping=new ArrayList();
	        for(int i=0;i<A.length;i++){
	            boolean over=false;
	            for(int j=i;j<A.length;j++){
	                if(B[i]>=A[j] && i!=j){
	                    over=true;
	                    ovelappingmap.put(i, j);
	                    if(!overlapping.contains(i))
	                    overlapping.add(""+i);
	                    if(!overlapping.contains(j))
		                    overlapping.add(""+j);
	                    //overlapping.add(j);
	                }
	            }
	            

	        }
	        
	        System.out.println(overlapping);
           for(int i=0;i<A.length;i++) {
        	   if(!overlapping.contains(""+i)) {
        		   nonoverlapping.add(""+i);
        	   }
           }
System.out.println(ovelappingmap);
	        System.out.println(overlapping);
	        System.out.println(nonoverlapping);
	        
	        System.out.println( ovelappingmap.size()+nonoverlapping.size());
		
		
	}

}
