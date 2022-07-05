import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.*;

public class ChooseAndSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A= "abba";//"abcdefghijklabcdefghijklpop";//"abba"; //
		char[] array=A.toCharArray();
		List<Character> list=new ArrayList();
		for(int i=0;i<array.length;i++) {
			if(!list.contains(array[i]))
			list.add(array[i]);
		

		}
		Collections.sort(list);
		System.out.println(list);
		
	}
}
	
