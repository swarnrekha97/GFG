import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MaximumTopmostAfterK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0};
				
		int k=1000000000;
		
		int res=maximumTop(nums,  k) ;
		System.out.println(res);
	}

	
	 static int maximumTop(int[] nums, int k) {
	        int result=-1;
	        if(nums.length==1 && k%2!=0){
	            result= -1;
	            return result;
	        }
	        
	        HashMap<Integer, List<Integer>> numindexmap=new HashMap();
	        List<Integer> numlist=new ArrayList();
	        for(int i=0;i<nums.length;i++){
	        	if(!numindexmap.containsKey(nums[i]))
	        	{List<Integer> indexlist= new ArrayList();
	        	indexlist.add(i);
	            numindexmap.put(nums[i],indexlist);
	        	}
	        	else
	        	{
	        		List<Integer> indexlist=numindexmap.get(nums[i]);
	        		indexlist.add(i);
		            numindexmap.put(nums[i],indexlist);
	        	}
	            numlist.add(nums[i]);
	        }
	        
	        
	        Collections.sort(numlist);
	        
	        for(int j=numlist.size()-1;j>=0;j--){
	            List<Integer> indexlist=numindexmap.get(numlist.get(j));
	            boolean resfound=false;
	            for(int index:indexlist) {
	            if(index>k || index==k-1){
	                continue;
	                
	            }
	            else{
	                result=numlist.get(j);
	                resfound=true;
	                break;
	            }
	            }
	            
	            if(resfound)
	            	break;
	        }
	        
	        return result;
	    }
}
