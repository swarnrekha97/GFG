import java.util.Stack;

public class MinWeightEdges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s= new Stack();
		s.push('u');
		char c=(char) s.pop();
		System.out.println(c);
		System.out.println(s);
		int[][] edges= {{0,2,2},{0,5,6},{1,0,3},{1,4,5},{2,1,1},{2,3,3},{2,3,4},{3,4,2},{4,5,1}};
		int n=6;
		int src1=0;
		int src2=1;
		int dest=5;
		long weight1= minimumWeight(n,edges,src1,src2,dest) ;
		System.out.println(weight1);

	}
	
	
	    static long minimumWeight(int n, int[][] edges, int src1, int src2, int dest) {
	        
	        long minweightsrc1=minweight(edges,src1,dest);
	        long minweightsrc2=minweight(edges,src2,dest);
	        return minweightsrc1;
	        
	    }
	    
	   static long minweight(int[][] edges, int src, int dest){
	        long weight=0;
	        int i=0;
	        while(i<edges.length){
	             System.out.println(edges[i][0]+" "+src);
	            if(edges[i][0]==src && edges[i][1]!=dest){
	            weight+=edges[i][2];
	                src=edges[i][1];
	                continue;
	            }
	            else if(edges[i][0]==src && edges[i][1]==dest) {
	            	weight+=edges[i][2];
	            	break;
	            }
	            System.out.println(src);
	            i++;
	        }
	        System.out.println(src);
	        return weight;
	    }
	

}
