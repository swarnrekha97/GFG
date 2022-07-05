
public class MatrixManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixManipulation cl= new MatrixManipulation();
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		printMatrix(matrix);
		cl.rotateMatrixClockwise(matrix);
		System.out.println("after rotation 90 degree clockwise");
		printMatrix(matrix);
		
		cl.rotateMatrixCounterClockwise(matrix);
		System.out.println("after rotation 90 degree counter clockwise");
		printMatrix(matrix);
	}
	
	private void rotateMatrixClockwise(int[][] matrix) {
		// TODO Auto-generated method stub
		//first transpose then vertical reflection
		MatrixManipulation cl= new MatrixManipulation();
		cl.transposeMatrix(matrix);
		//System.out.println("after transpose");
		//printMatrix(matrix);
		cl.verticalReflection(matrix);
		//System.out.println("after vertical reflection");
		//printMatrix(matrix);
	}

	
	private void rotateMatrixCounterClockwise(int[][] matrix) {
		// TODO Auto-generated method stub
		//first transpose then horizontal reflection
		MatrixManipulation cl= new MatrixManipulation();
		cl.transposeMatrix(matrix);
		//System.out.println("after transpose");
		//printMatrix(matrix);
		cl.horizontalReflection(matrix);
		//System.out.println("after vertical reflection");
		//printMatrix(matrix);
	}

	private static void printMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print("\t"+matrix[i][j]);
			}
			System.out.println();
		}
	}

	public void transposeMatrix(int[][] matrix) {
		//replace rows with columns
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=i;j<matrix[0].length;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
			//System.out.println();
		}
		
		
		}
	
	public void verticalReflection(int[][] matrix) {
		int n=matrix[0].length;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<n/2;j++) {
				int temp= matrix[i][j];
				matrix[i][j]=matrix[i][n-j-1];
				matrix[i][n-j-1]=temp;
			}
		}
	}
	
	public void horizontalReflection(int[][] matrix) {
		int n=matrix.length;
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				int temp= matrix[i][j];
				matrix[i][j]=matrix[n-i-1][j];
				matrix[n-i-1][j]=temp;
			}
		}
	}

}
