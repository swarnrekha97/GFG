import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShortestUniquePrefix {

	private void method(String[] str, StringBuilder sb) {
		// TODO Auto-generated method stub
		Map<Character, List<String>> first = 	Arrays.stream(str).collect(Collectors.groupingBy(x->x.charAt(0)));
		first.entrySet().forEach(x->
		{
			//if(x.getValue().size()==1)
			sb.append(x.getKey()+",");
		}
		);
		String[] out =	first.values().stream().filter(x->x.size()>1).flatMap(x->x.stream()).toArray(String[]::new);
		System.out.println(sb.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int	N = 4;
			String	arr[] = {"zebra", "dog", "duck", "dove"};
			String s = "";
			StringBuilder sb  = new StringBuilder();
			Map<Character, List<String>> first = 	Arrays.stream(arr).collect(Collectors.groupingBy(x->x.charAt(0)));
			first.entrySet().forEach(x->
					{
						//if(x.getValue().size()==1)
						sb.append(x.getKey()+",");
					}
					);
		String[] out =	first.values().stream().flatMap(x->x.stream()).toArray(String[]::new);
			System.out.println(sb.toString());
			
//			HashMap<String,List<String>> letterwordmap=new HashMap();
//			for(int i=0;i<N;i++) {
//				String s=arr[i];
//				char[] strchar=s.toCharArray();
//				for(int j=0;j<strchar.length;j++) {
//					
//					if(!letterwordmap.containsKey(""+strchar[j])) {
//						List<String> charwordlist=new ArrayList();
//						charwordlist.add(s);
//					letterwordmap.put(""+strchar[j], charwordlist);
//					}
//					else {
//						List<String> charwordlist=letterwordmap.get(""+strchar[j]);
//						charwordlist.add(s);
//						letterwordmap.put(""+strchar[j], charwordlist);
//					}
//				}
//				
//				}
//			System.out.println(letterwordmap);
			
			
	}

}
