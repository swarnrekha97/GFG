import java.util.ArrayList;
import java.util.List;

public class printRowsCols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> returnlist=new ArrayList();
		String s="A1:F1";
		char col1=s.charAt(0);
		int ascii1 = col1;
        char row1=s.charAt(1);
        int rowint1=Integer.parseInt(""+row1);
        char col2=s.charAt(3);
        int ascii2 = col2;
        char row2=s.charAt(4);
        int rowint2=Integer.parseInt(""+row2);
        
        for(int i=ascii1;i<=ascii2;i++) {
        	for(int j=rowint1;j<=rowint2;j++) {
        		returnlist.add((char)i+":"+j);
        	}
        	
        }
        System.out.println(returnlist);
	}

}
