import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class RomantoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Integer> charmap= new TreeMap();
		charmap.put(1, 2);
		System.out.println(charmap.pollFirstEntry().getValue());
		System.out.println(charmap.keySet().iterator().next());
		
		List<String> l1= new ArrayList();
		
		
		String s="MCMXCIV";
		  
        HashMap<Character,Integer> symbolnummap=new HashMap();
        symbolnummap.put('I',1);
        symbolnummap.put('V',5);
        symbolnummap.put('X',10);
        symbolnummap.put('L',50);
        symbolnummap.put('C',100);
         symbolnummap.put('D',500);
         symbolnummap.put('M',1000);
        int num=0;
        for(int i=0;i<s.length();i++){
           // System.out.println(i);
            char c=s.charAt(i);
           // System.out.println(c);
            if(c=='I' && i+1<s.length() && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                System.out.println("IC||IV="+(symbolnummap.get(s.charAt(i+1))-symbolnummap.get(c)));
                num+=(symbolnummap.get(s.charAt(i+1))-symbolnummap.get(c));
                i++;
            }
           
            else   if(s.charAt(i)=='X' && i+1<s.length() && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
             System.out.println("XL||XC="+(symbolnummap.get(s.charAt(i+1))-symbolnummap.get(c)));
                     num+=(symbolnummap.get(s.charAt(i+1))-symbolnummap.get(c));
                     i++;
            }
           
            else    if(s.charAt(i)=='C' && i+1<s.length() && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                   System.out.println("CD||CM="+(symbolnummap.get(s.charAt(i+1))-symbolnummap.get(c)));
                num+=(symbolnummap.get(s.charAt(i+1))-symbolnummap.get(c));
                   i++;
            }
               else
               {
            	   System.out.println(c+"="+symbolnummap.get(c));
            num+=symbolnummap.get(c);
               }
            System.out.println(num);
        }
        
        System.out.println(num);
        
    }
	}


