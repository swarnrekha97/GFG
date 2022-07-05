import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Puzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String riddle="ab?ac?";
		ArrayList<Character> strchars=new ArrayList<>();
		ArrayList<Character> engchars=new ArrayList<>();
		 StringBuilder res=new StringBuilder();
	      

	        for(int i=0;i<riddle.length();i++){
	        	strchars.add(riddle.charAt(i));
	        	}
	        
	        for(int i=97;i<123;i++){
	        	engchars.add((char)i);
	        	}

	        
	        System.out.println(strchars);
	        System.out.println(engchars);
	        engchars.removeAll(strchars);
	        
	        System.out.println(engchars);
	        for(int i=0;i<riddle.length();i++){
	        	
	            if(riddle.charAt(i)=='?'){
	                res.append(engchars.get(i));
	                //replace char
	            }
	            else
	            	res.append(riddle.charAt(i));

	        }
	        
	        System.out.println(res.toString());
	        
	}
	
}

