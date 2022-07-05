import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidTransactions {

	
	public static void main(String args[]) {	
		String[] input={"alice,20,800,mtv","bob,50,1200,mtv","alice,20,800,mtv","alice,50,1200,mtv","alice,20,800,mtv","alice,50,100,beijing"};
		String[] output={"alice,20,800,mtv","bob,50,1200,mtv","alice,20,800,mtv","alice,50,1200,mtv","alice,20,800,mtv","alice,50,100,beijing"};
	    List<String> invalidTransactions;
	      List<String> name=new ArrayList();
	        List<String> invalid=new ArrayList();
	        Map<String,List<String>> transmap=new HashMap();
	        
	      
	        // Map<String,String> namestr=new HashMap();
	        for(int i=0;i<input.length;i++){
	            String str=input[i];
	            String[] subs=str.split(",");
	            String n=subs[0];
	            String t=subs[1];
	            String a=subs[2];
	            String c=subs[3];
	            
	           
	            if(!transmap.containsKey(n)){
	               //name.add(n);
	            	 if(Integer.parseInt(a)>1000){
	 	                invalid.add(str);
	 	                continue;
	 	            }
	                List<String> ls= new ArrayList();
	                ls.add(str);
	                transmap.put(n,ls);
	            }
	            else
	            {
	               /*String x= nametrans.get(n);
	                String[] t_city=x.split("-");
	                int time1= Integer.parseInt(t_city[0]);
	                String cit=t_city[1];
	                if(!cit.equalsIgnoreCase(c) && Math.abs(time1-Integer.parseInt(t))<60)
	                {*/ 
	            	boolean ifinvalid=false;
	                    List<String> validstr=transmap.get(n);
	                    for(int k=0;k<validstr.size();k++){
	                       String trxs= validstr.get(k);
	                        String[] dets=trxs.split(",");
	                        String c1=dets[3];
	                        String ts=dets[1];
	                        if(!c1.equalsIgnoreCase(c) && Math.abs(Integer.parseInt(t)-Integer.parseInt(ts))<60)
	                        {
	                        	//System.out.println(n+" in different city :"+c1 +" than "+c);
	                            invalid.add(trxs);
	                            ifinvalid=true;
	                            
	                            
	                        }
	                    }
	                    if(ifinvalid)
	                    {
	                    invalid.add(str);
	                                 
	                    }
	                 //   continue;
	               // }
	               // else
	                //{
	                  
	                   
	                   validstr.add(str);
	                   transmap.put(n,validstr);
	                //}
	                
	            }
	            
	        }
	        
	        System.out.println(invalid);
	    
	}
}
