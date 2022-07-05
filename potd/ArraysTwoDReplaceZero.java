import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArraysTwoDReplaceZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
			      {1, 5, 45, 0, 81},
			      {6, 7, 2, 82, 8},
			      {20, 22, 49, 5, 5},
			      {0, 23, 50, 4, 92}
			    };
			    print_matrix(matrix);
			    
			    int rows=matrix.length;
			    int cols=matrix[0].length;
			 List<Integer> zero_rows=new ArrayList();   
			 List<Integer> zero_cols=new ArrayList(); 
			    
			    for(int i=0;i<rows;i++) {
			    	for(int j=0;j<cols;j++) {
			    		if(matrix[i][j]==0) {
			    			if(!zero_rows.contains(i))
			    			zero_rows.add(i);
			    			
			    			if(!zero_cols.contains(j))
			    			zero_cols.add(j);
			    		}
			    	}
			    }
			    
			    System.out.println(zero_rows);
			    System.out.println(zero_cols); 
			  for(int num:zero_rows){
				  for(int k=0;k<cols;k++) {
					  matrix[num][k]=0;
				  }
			  }
			  
			  for(int k=0;k<rows;k++){
				  for(int num:zero_cols) {
					  matrix[k][num]=0;
				  }
			  }
			  print_matrix(matrix);
	}

	
	static int[][] create_random_matrix(int rows, int cols) {
	    int[][] v = new int[rows][cols];

	    for(int i = 0; i < rows; ++i) {
	      for (int j = 0; j < cols; ++j) {
	        int t = new Random().nextInt() % 100;
	        v[i][j] = t + 1;
	        if (Math.abs(t) % 100 <= 5) {
	          v[i][j] = 0;
	        }
	      }
	    }
	    return v;
	  }
	
	 static void print_matrix(int[][] m) {
		    System.out.println();
		    for (int i = 0; i < m.length; ++i) {
		      for (int j = 0; j < m[i].length; ++j) {
		        System.out.print(m[i][j]);
		        System.out.print("\t");
		      }
		      System.out.println();
		    }
		  }
}
