import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;

public class MissingNumber {

	public static void main(String[] args) {
		String s="111101";
		int is=s.codePointCount(0, s.length());
		System.out.println("codepoint="+is);
		String[] s1= {"1","11","1","1"};
		Arrays.sort(s1);
		System.out.println("after split="+s1[3].length());
		// TODO Auto-generated method stub
		Integer[] array= {1,2,4};
		int n=2;
//		int missing=0;
        List<Integer> list=Arrays.stream(array).sorted().toList();
       // Collections.sort(list.);
        
        for (int i = 0; i < array.length; i++) {
			if(list.get(i)-i>1) {
			System.out.println(list.get(i)-1);	
			break;
			}
		}
//        int listindex=0;
//        for(int i=0;) {
//        	
//        }
//        
//        for(int i=1;i<=n;i++){
//        	System.out.println("comparing ");
//        	if(listindex<list.size() && list.get(listindex)==i) {
//        		listindex++;
//        	}
//        	else {
//        		missing=i;
//                break;
//        	}
//           /* if(!list.contains(i)){
//                missing=i;
//                break;
//            }*/
//        }
//        System.out.println(missing);
//	}

}
}