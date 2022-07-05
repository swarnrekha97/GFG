
public class ShortestUniPrefSwarna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	N = 4;
		String	arr[] = {"zebra", "dog", "duck", "dove"};
		String res[]=new String[4];
		
		
		for(int i=0;i<N;i++) {
			String s=arr[i];
			char[] s_chars=s.toCharArray();
			int s_len=s_chars.length;
			
			String key=""+s.charAt(0);
			boolean flag=false;
			//System.out.println("key="+key);
			for(int j=0;j<s_len;j++) {
				if(flag)
				{
					//System.out.println("chart at j="+s.charAt(j));
					key=key+s.charAt(j);
				}
				System.out.println("key==="+key);
				for(int k=0;k<N;k++) {
					String sk=arr[k];
					
					if(sk.startsWith(key) && !sk.equalsIgnoreCase(s)) {
						System.out.println(sk+" startswith key="+key);
						flag=true;
						break;
					}
					else 
						flag=false;
					
				}
				if(!flag)
					break;
			}
			
			res[i]=key;
		}
		
		System.out.println(res[0]+" "+res[1]+" "+res[2]+" "+res[3]);
	}

}
