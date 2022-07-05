
public class CountOddNosInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int low=	278382788;
		int high=	569302584;
	
	  int count=(high-low)/2;
	  if(low%2!=0 || high%2!=0)
              count++;
     
      System.out.println(count);
	}

}
