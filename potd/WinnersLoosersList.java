import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class WinnersLoosersList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<List<Integer>> reslist=new ArrayList();
		int[][] input= {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
	
		
		List<Integer> winnerslist=new ArrayList();
	List<Integer> looserslist=new ArrayList();
	HashMap<Integer,Integer> loosermap=new HashMap();
			for(int i=0;i<input.length;i++) {
				winnerslist.add(input[i][0]);
				looserslist.add(input[i][1]);
			
			}
	System.out.println("winnerslist="+winnerslist);

	System.out.println("loosermap="+loosermap);
	Collections.sort(looserslist);
	System.out.println("looserslist="+looserslist);
	winnerslist.removeAll(looserslist);
	
	List<Integer> winlist=winnerslist.stream().distinct().collect(Collectors.toList());
	Collections.sort(winlist);
	reslist.add(0,winlist);
	
	//int prev=looserslist.get(0);
	List<Integer> lslist=new ArrayList();
	for(int i=0;i<looserslist.size();i++) {
		if(!loosermap.containsKey(input[i][1])) {
			loosermap.put(input[i][1], 1);
		}
		else
			loosermap.put(input[i][1],loosermap.get(input[i][1])+1);
	}
	System.out.println("loosermap="+loosermap);
	
Iterator itr=loosermap.keySet().iterator();
List<Integer> ls=new ArrayList();
while(itr.hasNext()) {
	int key=(int)itr.next();
	if(loosermap.get(key)==1) {
		ls.add(key);
	}
	}
Collections.sort(ls);
reslist.add(1, ls);

System.out.println(reslist);
	}

}
