import java.util.HashMap;

public class ConsecutiveChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=4,B=1;
		StringBuilder sb=new StringBuilder("123");
		sb.reverse();
		HashMap<> h=new HashMap();
		String s="";
      /*  int num=0;
        if(A>B)
        {
            num=A/B;
        }
        else
        num=B/A;

        System.out.println("num="+num);
        if(A>B){
        for(int i=0;i<A;i++){
            s+="a";
            for(int j=0;j<num;j++){
                if(B>0)
                {
                s+="b";
                B--;
                }
            }
        }
    }
     else{
        for(int i=0;i<B;i++){
            s+="b";
            for(int j=0;j<num;j++){
                if(A>0)
                {
                s+="a";
                A--;
                }
            }
        }
    }
        */
        if(A>B) {
        	while(A>0) {
        		
        		for(int i=0;i<2;i++) {
        			if(A>0) {
        			s+="a";
        			A--;
        			}
        		}
        		if(B>0) {
        			s+="b";
        			B--;
        		}
        	}
        	if(s.length()<A+B) {
        		if(B>0) {
        			s+="b";
        			B--;
        		}
        	}
        }
        
        else{
        	while(B>0) {
        		
        		for(int i=0;i<2;i++) {
        			if(B>0) {
        			s+="b";
        			B--;
        			}
        		}
        		if(A>0) {
        			s+="a";
        			A--;
        		}
        	}
        	
        }
        
        System.out.println(s);;
	}

}
