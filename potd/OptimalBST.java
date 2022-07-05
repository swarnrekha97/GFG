import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class OptimalBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 5, ans=224;
			int[]	keys = {1, 4, 5, 32, 34};
			int[] freq = {39 ,14 ,40 ,14, 12};
			TreeMap<Integer,Integer> freqKeymap= new TreeMap<>();
			for(int i=0;i<N;i++) {
				freqKeymap.put(freq[i], keys[i]);
			}
			
			
		Arrays.sort(freq);
		int root=freq[N-1];
		int sum=0;
		sum+=createLeftTree(root,keys);
		createRightTree(root,keys);
		
		int j=1,sum1=0;
		for(int i=N-1;i>=0;i--) {
			sum1+=freq[i]*j;
			j++;
			
		}	
		
		System.out.println("sum="+sum1);
	}

	private int createLeftTree(int root, int[] keys) {
		// TODO Auto-generated method stub
		
		
	}

}
