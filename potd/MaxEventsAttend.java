import java.util.Arrays;

public class MaxEventsAttend {


	public static void main(String[] args) {
	int[] start= {1,2,1};
	int[] end = {2,3,1};
	int dist_start=0;
	System.out.println(Arrays.stream(start).distinct().count());
	long res=Math.min(Arrays.stream(start).distinct().count(), Arrays.stream(end).distinct().count());
	System.out.println(Integer.parseInt(""+res));
	}
}
