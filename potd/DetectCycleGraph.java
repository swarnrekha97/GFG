import java.util.ArrayList;

public class DetectCycleGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V=8;
		ArrayList<ArrayList<Integer>> adj = new ArrayList();;
		ArrayList<Integer> adj0=new ArrayList();
		adj0.add(2);
		
		ArrayList<Integer> adj1=new ArrayList();
		//adj1.add(0);
		adj1.add(4);
		
		ArrayList<Integer> adj2=new ArrayList();
		//adj2.add(1);
		adj2.add(7);
		
		ArrayList<Integer> adj3=new ArrayList();
		adj3.add(5);
		
		ArrayList<Integer> adj4=new ArrayList();
		adj4.add(1);
		adj4.add(6);
		
		ArrayList<Integer> adj5=new ArrayList();
		adj5.add(3);
		ArrayList<Integer> adj6=new ArrayList();
		adj6.add(0);
		
		
		//adj3.add(2);

		adj.add(adj0);
		adj.add(adj1);
		adj.add(adj2);
		adj.add(adj3);
		adj.add(adj4);
		adj.add(adj5);
		adj.add(adj6);
		
		System.out.println(adj);
		ArrayList<Integer> visited= new ArrayList();
		for(int i=0;i<V;i++) {
			ArrayList<Integer> adjlist=adj.get(i);
			//visited.add(i);
			System.out.println(visited);
			//System.out.println(adjlist);
			for(int k=0;k<adjlist.size();k++) {
				if(!visited.contains(adjlist.get(k)))
					visited.add(adjlist.get(k));
				else 
					System.out.println("cycle");
			}
		}
	}

}
