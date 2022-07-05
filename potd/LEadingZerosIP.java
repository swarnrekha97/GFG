
public class LEadingZerosIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="0192.03369795652.000.00042215125926353746906486.0717013788275641297511";
		String[] s=S.split("\\.");
		String returnstr="";
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			if(s[i].startsWith("0")) {
				
				int j=0;
				for(int k=0;k<s[i].length();k++) {
					if(s[i].charAt(k)=='0'){
						j++;
						continue;
					}
					else
						break;
				}
				
				s[i]=s[i].substring(j,s[i].length());
				if(s[i]=="")
					s[i]="0";
				
				/*long num = 0;
				try {
					num=Long.parseLong(s[i]);
					s[i]=""+num;
				}
				catch(Exception ex) {
					int j=0;
					for(int k=0;k<s[i].length();k++) {
						if(s[i].charAt(k)=='0'){
							j++;
							continue;
						}
						else
							break;
					}
					
					s[i]=s[i].substring(j,s[i].length());
				}*/
				
			}
			returnstr+=s[i]+".";
		}
		returnstr=returnstr.substring(0, returnstr.length()-1);
System.out.println("return"+returnstr);
	}

}
