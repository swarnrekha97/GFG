import java.util.HashMap;

public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S="cdeo";
		int[] A= {3,2,0,1};
        HashMap<Integer,String> charmap= new HashMap();
        HashMap<Integer,Integer> personplacemap= new HashMap();
        for(int i=0;i<S.length();i++){
            charmap.put(i,""+S.charAt(i));
        }

        for(int i=0;i<A.length;i++){
            personplacemap.put(i,A[i]);
        }
        
        //System.out.println(charmap);
       // System.out.println(personplacemap);
        int temp=A[0];
        //System.out.println(temp);
        
        String code=charmap.get(0);
        //System.out.println(personplacemap.get(temp));
        while(temp!=0){
           // int pos=personplacemap.get(temp);
            //System.out.println("inside while");
            code+=charmap.get(temp);
            temp=personplacemap.get(temp);
            //pos=personplacemap.get(pos);
        }

        System.out.println(code);

	}

}
