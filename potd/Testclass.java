import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.w3c.dom.DOMStringList;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Double d=Math.pow(2, 31);
		
		
		
		//System.out.println("0="+(1<1));
		
	    int count=0;

        for(int i=10;i<=10;i++){
            if(i%5==0){
                count++;
            }
        }
        int N=100;
        int[] A= {
        		47,46,31,39,64,76,76,30,24,83,74,33,37,7,47,67,100,78,41,17,52,40,48,57,58,3,82,11,40,100,92,10,32,62,76,82,53,61,15,75,9,29,59,88,52,63,31,83,80,70,54,96,9,87,95,78,89,66,37,21,19,3,96,100,30,69,33,18,82,44,61,93,26,3,91,42,67,95,44,68,73,26,9,98,70,67,34,95,26,53,98,25,81,35,18,23,86,50,62,7,97,94,1,16,87,39,65,90,36,70,22,83,68,91,50,61,42,37,73,28,53,39,34,61,28,74,32,35,41,49,100,61,51,14,34,22,17,86,21,74,53,3,11,38,51,33,81,29,83,84,63,53,10,28,91,83,88,83,48,78,42,49,55,40,67,47,8,73,70,90,7,92,23,44,40,71,44,7,65,40,14,80,47,20,30,28,57,12,80,44,46,46,32,32,6,61,23,41,95,31,81,96,79,48,38,35,15,59,83,59,32,75,77,17,2,5,40,66,50,54,91,5,57,57,53,21,70,29,48,46,22,45,43,67,38,11,75,16,57
        		,4,85,57,9,63,3,3,27,62,1,68,86,10,21,88,89,58,41,94,55,31,69,10,44,11,6,59,91,57,72,75,47,1,84,48,50,91,1,13,5,89,55,16,29,10,12,25,71,18,45,99,21,32,87,6,70,6,72,94,38,40};
        int min=(N*3)/2;
        System.out.println(min);
        List<Integer> arr1= new ArrayList<Integer>();
        List<Integer> arr2= new ArrayList<Integer>();
        
        for(int i=0;i<min;i++){
            arr1.add(A[i]);
        }
         for(int i=min;i<A.length;i++){
            arr2.add(A[i]);
        }
        
        Collections.sort(arr1);
        Collections.sort(arr2);
        System.out.println("array1-"+arr1.size());
        System.out.println("maxarray-"+arr2.size());
        int j=N;
        while(j>0) {
        	int num1=arr2.get(arr2.size()-1);
        	int num2= arr1.get(0);
        	//System.out.println("num1-"+num1);
        	//System.out.println("num2-"+num2);
       arr2.remove(arr2.size()-1);
       j--;
       arr1.remove(0);
       j--;
        }
       System.out.println(arr1.get(0));
       System.out.println(arr2.get(arr2.size()-1));
       int sum1=0;
       int sum2=0;
       for(int i=0;i<arr1.size();i++) {
    	   sum1+=arr1.get(i);
       }
       for(int i=0;i<arr2.size();i++) {
    	   sum2+=arr2.get(i);
       }
       
       System.out.println(sum1-sum2); //3974
       
     Stack<Integer> st= new Stack();
     st.push(1);
     st.push(4);
     st.s
}

	
	
}