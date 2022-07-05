import java.util.ArrayList;
import java.util.Collections;

public class MissingPositiveNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1876544;
		System.out.println(Integer.toBinaryString(i));
String s="111001010001001000000";
int a=5,b=3;

System.out.println(a/b);
//System.out.println(str.length());
		int[] nums= {-2,-3,3,1};
	int res=firstMissingPositive(nums);
	
	System.out.println(res);
	}
	
	
	    static int firstMissingPositive(int[] nums) {
	        
	        ArrayList<Integer> alist= new ArrayList();
	       
	        
	        for(int i=0;i<nums.length;i++){
	            alist.add(nums[i]);
	        }
	        
	        Collections.sort(alist);
	        
	        int min=alist.get(0);
	        int max=alist.get(nums.length-1);
	        int missing=0;
	        if(max<1){
	           missing=1; 
	            return missing;
	        }
	        if(min>1 && max>1){
	            missing=1; 
	            return missing;
	        }
	        
	        int k=alist.get(0);
	        for(int i=0;i<alist.size();i++){
	        	System.out.println("i="+alist.get(i)+" k="+k);
	        	if(alist.get(i)<0) {
	        		k++;
	        		continue;
	        	}
	         if(k!=alist.get(i) && k>0) {
	        	missing=k;
	        	break;
	         }
	         k++;
	        }
	       // System.out.println("missing="+missing);
	        if(missing==0 && max>=1)
	            missing=max+1;
	        
	        return missing;
	    }
	

}
