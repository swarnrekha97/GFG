
public class ZigZagString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="PAYPALISHIRING";
		int len=s.length();
		int n=3;
		
		char[][] m=new char[n][100];
		
		int j=0; int k=0;
		
		while(len>=0) {
			int index=0;
			
			for(int i=0;i<n;i++) {
				System.out.println("begin for :index ="+index+" " + j);
				if(len>0) {
				m[i][j]=s.charAt(k);
				//System.out.println(k+" "+ m[i][j]);
				k++;
				index++;
				len--;
				System.out.println(m[i][j]);
				}
			}
			index--;
			System.out.println("end for index="+index);
			while(index!=0) {
				if(len>0) {
					index=index-1;
					j=j+1;
					System.out.println("index ="+index+" " + j);
					m[index][j]=s.charAt(k);
					k++;
					len--;
					System.out.println(m[index][j]);
				}
			}
			//System.out.println("end inner while k="+k);
			
		}
	

	}

}
