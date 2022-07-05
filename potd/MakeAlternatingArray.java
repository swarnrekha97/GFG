import java.util.HashMap;

public class MakeAlternatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Integer> numcount=new HashMap();
		int[] nums= {69,91,47,74,75,94,22,100,43,50,82,47,40,51,90,27,98,85,24};
		   if(nums.length==1 ||nums.length==2)
	            System.out.println(0);
	        
	        int num1=nums[0];
	        int num2=nums[1];
	        
	        int count=0;;
	        for(int i=0;i<nums.length;i++) {
	        	if(!numcount.containsKey(nums[i])) {
	        		numcount.put(nums[i], 1);
	        		
	        	}
	        	else{
	        		int count1=numcount.get(nums[i]);
	        		numcount.put(nums[i],count1++);
	        	}
	        	
	        	
	        }
	        for(int i=2;i<nums.length;i=i+2){
	            if(nums[i]!=num1)
	            count++;
	        }
	        
	         for(int j=3;j<nums.length;j=j+2){
	            if(nums[j]!=num2)
	            count++;
	        }
	        
	        
	        System.out.println(count);
	        
	}

}
