
public class RectanglesWithCorners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4,M=3;
		int matrix[][] = 
			{
			{0,1,0},
			{0,1,0},
			{1,1,1}, 
			{1,0,1}
			} ;
		

		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		
		for(int i=0;i<N;i++) {
			//System.out.println("row "+i);
			for(int j=0;j<M;j++) {
				//System.out.println("column "+j);
				if(matrix[i][j]==1) {
					  boolean flag1=false, flag2=false;
					System.out.println("1 found at ("+i+","+j+")");
					int index=1;
					int index2=1;
					int k=j+1;
					int l=i+1;
					while(k<M && l<N) {
						if(matrix[i][k]==1) {
							index=k;
							System.out.println("right index found at ("+i+","+index+")");
							flag1=true;
							//break;
						}
						if(matrix[l][j]==1) {
							index2=l;
							flag2=true;
							System.out.println("down index found at ("+index2+","+j+")");
							//break;
						}
						if(flag1 && flag2 && matrix[index2][index]==1) {
							System.out.println("going to look for ("+index2+","+index+")");
							
							System.out.println("yes");
							
						}
						System.out.println("not found");
						k++;
						l++;
					}
					/*
					for(int k=j+1;k<M;k++) {
						if(matrix[i][k]==1) {
							index=k;
							System.out.println("right index found at ("+i+","+index+")");
							flag1=true;
							break;
						}
						//index++;
					}
					
					for(int l=i+1;l<N;l++) {
						if(matrix[l][j]==1) {
							index2=l;
							flag2=true;
							System.out.println("down index found at ("+index2+","+j+")");
							break;
						}
						//index2++;
					}
					
					
					if(flag1 && flag2 && matrix[index2][index]==1) {
						System.out.println("going to look for ("+index2+","+index+")");
						
						System.out.println("yes");
						System.out.println("indexes =("+index2+","+j+")");
						System.out.println("indexes =("+i+","+index+")");
						System.out.println("indexes =("+i+","+j+")");
						System.out.println("indexes =("+index2+","+index+")");
					}
					System.out.println("not found");*/
					System.out.println("--------------");
				}
			}
			
		}
	}

}
