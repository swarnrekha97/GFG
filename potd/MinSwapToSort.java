import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MinSwapToSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={7, 16, 14, 17, 6, 9, 5, 3, 18};
					//3,16,14,17,6,9,5,7,18
					//3,5,14,17,6,9,16,7,18
					//3,5,6,17,14,9,16,7,18
					//3,5,6,7,14,9,16,17,18
					//3,5,6,7,9,14,16,17,18
					//0,1,2,3,4,5,6,7,8
		//int [] arr1= {1,2,3,4,5,8};
		
		TreeMap<Integer,Integer> arrmap= new TreeMap<>();
		for(int i=0;i<arr.length;i++) {
			arrmap.put(arr[i],i);
		}
		System.out.println(arrmap);
		
		Set<Integer> keys=arrmap.keySet();
		int k=0,swap=0;
		Iterator itr= keys.iterator();
			while(itr.hasNext()){
				int key=(int)itr.next();
				//System.out.println("key="+key+" actual="+arrmap.get(key)+" expected="+k);
				int position_actual=arrmap.get(key);
				if(position_actual!=k) {
					arrmap.put(key, k);
					arrmap.put(arr[k],position_actual);
					int tem=arr[k];
					arr[k]=key;
					arr[position_actual]=tem;
					swap++;
					System.out.println("after swap ="+arrmap);
				}
			k++;
			
		}
			
				System.out.println(swap);
		

	}
	
	private static boolean ifSorted(int[] input) {
		boolean sorted=true;
		
		for(int i=0;i<input.length;i++) {
			for(int j=i;j<input.length;j++) {
				if(input[i]>input[j]) {
					sorted=false;
					break;
				}
			}
		}
		return sorted;
	}

}
