import java.util.*;

public class FindCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[] A= {1,3,2,4};
//int [] B= {4,1,3,2};

int[] A= {1};
int[] B= {1};
boolean f=findCycle(A,B);
System.out.println(f);
/*
		List<Integer> allnodes=new ArrayList();
        List<Integer> path=new ArrayList();
        List<Integer> start=new ArrayList();
        List<Integer> end=new ArrayList();
        for(int i=0;i<A.length;i++){
        	//System.out.println(A[i]);
            if(!allnodes.contains(A[i])){
            allnodes.add(A[i]);
            
            }
            if(!start.contains(A[i])) {
            	start.add(A[i]);
            }
            if(!allnodes.contains(B[i])){
            allnodes.add(B[i]);
            end.add(B[i]);
            
            }
        }
       // System.out.println("All nodes="+allnodes);
        //System.out.println("start="+start);
       int start1=A[0];
       path.add(start1);
       int next=findEnd(A[0],A,B);
       System.out.println("next="+next);
      
        if(next==0){
            System.out.println(false);
        }else{

            while(start.contains(next)){
            	System.out.println("next="+next);
            	System.out.println("path="+path);
                if(path.containsAll(allnodes)){
                    System.out.println(true);
                    break;
                }
             path.add(next);
             next=findEnd(next,A,B);
            }
        }
        */
	}

	static boolean findCycle(int[]A,int[]B) {
		 Boolean flag=false;
	        List<Integer> allnodes=new ArrayList();
	        List<Integer> path=new ArrayList();
	        List<Integer> start=new ArrayList();
	        List<Integer> end=new ArrayList();
	        for(int i=0;i<A.length;i++){
	            if(!allnodes.contains(A[i])){
	            allnodes.add(A[i]);
	           
	            }
	             if(!start.contains(A[i])) {
	            	start.add(A[i]);
	            }

	            if(!allnodes.contains(B[i])){
	            allnodes.add(B[i]);
	            end.add(B[i]);
	            
	            }
	        }

	       int start1=A[0];
	       path.add(start1);
	       int next=findEnd(A[0],A,B);
	        if(next==0){
	            return false;
	        }else{
	        	
	            while(start.contains(next)){
	            	System.out.println("path="+path.toString());
	                if(path.containsAll(allnodes)){
	                    flag=true;
	                    break;
	                }
	                if(next==start1) {
	                	System.out.println("cycle detected");
	                	flag=false;
	                	break;
	                }
	              
	             path.add(next);
	             next=findEnd(next,A,B);
	                
	            }
	        }
	        return flag;

	}
	static  int findEnd(int num,int[] A,int[]B){
	        int end=0;
	        for(int i=0;i<A.length;i++){
	            if(A[i]==num){
	                end=B[i];
	                break;
	            }
	        }

	        return end;
	    }
}
