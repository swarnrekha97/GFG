import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="basgadhbfgvhads";
	   String s1="sjdhgvbjdsbhvbvd";
	   int t=60;
	   int t1=80;
	   System.out.println(Math.abs(t-t1));
	   
		int count=0;

		char[] sarray=s.toCharArray();
		char[] s1array=s1.toCharArray();
	
		
		int res=Arrays.compare(sarray, s1array);
		System.out.println(res);
		List<Character>slist= new ArrayList();
		List<Character>s1list= new ArrayList();;
		s1list.s
		for(int i=0;i<sarray.length;i++) {
			slist.add(sarray[i]);
		}
		for(int i=0;i<s1array.length;i++) {
			s1list.add(s1array[i]);
		}
		System.out.println(slist);
		System.out.println(s1list);
		List<Character>templist=slist;
		
		slist.retainAll(s1list);  //;.retainAll(slist);
		s1list.retainAll(slist);
		System.out.println(slist);
		System.out.println(s1list);
		
	}

}
