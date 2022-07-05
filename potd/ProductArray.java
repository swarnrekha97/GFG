
public class ProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//int arr[]= {1,2,3,4,5};
			int arr[]= {3,2,1};
			int returnarr[]= new int[3];
			for(int i=0;i<3;i++) {
				
				int x=1;
				for(int j=0;j<3;j++) {
					if(j!=i) {
						x=x*arr[j];
					}
				}
				returnarr[i]=x;
			}
			
			System.out.println(returnarr);
			for(int i=0;i<3;i++) {
				System.out.println(returnarr[i]);
			}
	}

}
