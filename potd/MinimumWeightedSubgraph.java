
public class MinimumWeightedSubgraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 6;
		int[][] edges = {{0,2,2},{0,5,6},{1,0,3},{1,4,5},{2,1,1},{2,3,3},{2,3,4},{3,4,2},{4,5,1}};
		int src1 = 0, src2 = 1, dest = 5;
		int [][] matrix= new int[6][6];
		
		for(int i=0;i<edges.length;i++) {
			for(int j=0;j<edges[0].length;j++) {
				matrix[edges[i][0]][edges[i][1]]=edges[i][2];
				
				//else
					//matrix[i][j]=0;
			}
			
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();}
		
		long res=minimumWeight(n,matrix,src1,src2,dest);
		
	}

	
	  static long minimumWeight(int n, int[][] edges, int src1, int src2, int dest) {
	        
		  long s1=findPath(edges,src1,dest);
		  System.out.println("s1="+src1+" dest="+dest+" edge="+s1);
		  long s2=findPath(edges,src2,dest);
		  System.out.println("s2="+src2+" dest="+dest+" edge="+s2);
		  
		  return -1;
	    }
	    
	    static long findPath(int[][] edges, int src1, int dest){
	        long res=-1;
	        long sum=0;
	        System.out.println("src="+src1+" dest="+dest);
	        if(edges[src1][dest]!=0){
	          return   edges[src1][dest];
	        }
	        else {
	        	int[] paths=edges[src1];
	        	for(int i=0;i<paths.length;i++) {
	        		if(paths[i]!=0) {
	        			sum=	paths[i]+findPath(edges,i,dest);
	        			
	        		}
	        		
	        		if(sum!=0) {
	        			break;
	        		}
	        	}
	        	
	        }
	        System.out.println(sum);
	        return sum;
	    }
}
