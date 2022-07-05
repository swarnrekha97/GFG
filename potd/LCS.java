
public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String A="wjtboxvynfhkstcenau";String B="mnddxfdmvzcautdcckx"; String C="aaydzsxttobbgqngvvp";
		 int n1=19; int n2=19; int n3=19;
		   
		 System.out.println(LCSof3(A, B,C,n1, n2,n3)) ;
		
	}

	
	static int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
		int min=0;
		   int min1=Integer.min(n2, n3); 
		   int min2=Math.min(n1, n2);
		   if(min1==min2) {
			  min=min1; 
		   }
		   else if(min1<min2) {
			   min=min1;
		   }
		   else min=min2;
		   
		   String minStr="";
		   if (min==A.length())
			   minStr=A;
		   else if (min==B.length())
			   minStr=B;
		   else 
			   minStr=C;
		   
		   if(A.contains(minStr) && B.contains(minStr) && C.contains(minStr))
		   return min;
		   else
			   if(n1==n2 && n2==n3) {
				   int lcs1=subsequence(A,B,C,A);
				   int lcs2=subsequence(A,B,C,B);
				   int lcs3=subsequence(A,B,C,C);
				   System.out.println(lcs1+" lcs2 "+lcs2+" lcs3="+lcs3);
				   int max1= Math.max(lcs2, lcs3);
				   int max2= Math.max(lcs1, lcs3);
				  if (max1>max2)
					  return max1;
				  else return max2;
				   
			   }
			   return subsequence(A,B,C,minStr);
		   
		   
    }


	private static int subsequence(String a, String b, String c, String minStr) {
		// TODO Auto-generated method stub
		int minsublength=0;
		System.out.println(minStr);
		for(int i=0;i<minStr.length();i++) {
			String leftsub=minStr.substring(0,i);
			String rightsub=minStr.substring(i);
			//System.out.println("left="+leftsub);
			//System.out.println("right="+rightsub);
			if(a.contains(""+minStr.charAt(i)) && b.contains(""+minStr.charAt(i)) && c.contains(""+minStr.charAt(i))) {
				System.out.println("char found="+minStr.charAt(i));
				minsublength+=1;
				a=a.substring(a.indexOf(minStr.charAt(i))+1);
				b=b.substring(b.indexOf(minStr.charAt(i))+1);
				c=c.substring(c.indexOf(minStr.charAt(i))+1);
				System.out.println("a="+a);
				System.out.println("b="+b);
				
				System.out.println("c="+c);
				
				
			}
			/*if(a.contains(leftsub) && b.contains(leftsub) && c.contains(leftsub)) {
				minsublength= leftsub.length();
			}
			else if(a.contains(rightsub) && b.contains(rightsub) & c.contains(rightsub))
			{
				minsublength= rightsub.length();
			}*/
		}
		return minsublength;
	}
}
