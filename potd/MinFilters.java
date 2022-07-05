import java.util.ArrayList;
import java.util.Collections;

public class MinFilters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {100,100,100,100};
		int minpollution=0;
        int minfilters=0;
        ArrayList<Integer> pollutionarray=new ArrayList();
        for(int i=0;i<A.length;i++){
            minpollution+=A[i];
            pollutionarray.add(A[i]);
        }


        minpollution=minpollution/2;
        Collections.sort(pollutionarray);
        System.out.println(pollutionarray);
        System.out.println(minpollution);
       minfilters =findSum(pollutionarray,minpollution);
        System.out.println(minfilters);

	}

	

static int findSum(ArrayList<Integer>pollutionarray,int minpollution){
int sum=0;
int count=0;
for(int i=0;i<pollutionarray.size();i++){
sum+=pollutionarray.get(i);
}
System.out.println(sum);
while(sum>minpollution){
	sum=0;
int max=pollutionarray.get(pollutionarray.size()-1);

pollutionarray.remove(pollutionarray.size()-1);
max=max/2;
count++;
pollutionarray.add(max);
Collections.sort(pollutionarray);
System.out.println(pollutionarray);
for(int i=0;i<pollutionarray.size();i++){
sum+=pollutionarray.get(i);
}
}


return count;
}
}
