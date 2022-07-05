import java.util.Arrays;

public class HideTiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="110000";
		int numcarpets=1;
		int carpetlen=1;
		int res=minimumWhiteTiles(s,numcarpets,carpetlen);
		System.out.println(res);
	}

	static int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
        int visibletiles=0;
        String[] s=floor.split("0");
       if(s.length==0) {
    	   return 0;
       }
        if(s.length==1){
            //handle case for no black tile
            visibletiles=s[0].length();
            int tilerem=s[0].length();;
            for(int i=0;i<numCarpets;i++){
            	System.out.println("tilerem="+tilerem);
            	 if(tilerem >=carpetLen){
                 	visibletiles=visibletiles-carpetLen;
                 	tilerem=tilerem-carpetLen;
                     }
                     else {
                     	visibletiles=visibletiles-tilerem;
                     }
                
            }
        }
       else{
          Arrays.sort(s);
           int maxindex=s.length-1;
           visibletiles=countWhites(floor);
           System.out.println("visibletiles="+visibletiles);
           int tileshidden=0;
        for(int i=0;i<numCarpets;i++){
        	System.out.println("s[maxindex]="+s[maxindex]);
            if(s[maxindex].length() <=carpetLen){
        	visibletiles=visibletiles-s[maxindex].length();
               // tileshidden+=s[maxindex].length()-;
                maxindex--;
                //visibletiles=visibletiles-carpetLen;
            }
            else {
            	visibletiles=visibletiles-carpetLen;
            }
            System.out.println("visibletiles="+visibletiles);
            
        }
           
           //visibletiles=visibletiles-tileshidden;
       }
        return visibletiles;
        
    }
    
    static int countWhites(String s){
       int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        
        return count;
    }
}
