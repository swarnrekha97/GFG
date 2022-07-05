import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositiveNegativePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,-44, 27, 15, 16, -97, 21, -5, -48, -64, 29, -62, 62, -76, -68,
				89, 96, 7, -27, 20, -73, 3, -2, 90, 55, 34, 71, 56, 76, -87, -20,
				39, -58, 59, 23, 35, 83, 99, 40, -14, 98, 88, 24, -77, 18, 84, -60,
				44, 94, -33, 41, 11, -36};
		int n=53;
		ArrayList<Integer> returnlist = new ArrayList<Integer>();
		ArrayList<Integer> inputlist= new ArrayList<Integer>(n);
		for(int i=0;i<n;i++) {
			inputlist.add(arr[i]);
		}
		
		System.out.println(inputlist.size());
		for(int i=0;i<n;i++) {
			int current=arr[i];
			int currentpair=-arr[i];
			//System.out.println(current +" "+ currentpair);
		for(int j=i+1;j<n;j++) {
			if(arr[j]==currentpair)
			{
				returnlist.add(current);
				//returnlist.add(currentpair);
			}
		}
		}
		if(returnlist.size()!=0)
		System.out.println(returnlist);
		else
			System.out.println(0);
	}

}
