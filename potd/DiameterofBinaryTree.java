import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DiameterofBinaryTree {

	 static class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
		}
		
	public static void main(String[] args) {
		
	List<Integer> a= new ArrayList();
	Collections.sort(a);
		// TODO Auto-generated method stub
		Node n=new Node(10);
		Node n1=new Node(20);
		Node n2=new Node(30);
		Node n3=new Node(40);
		Node n4=new Node(60);
		n.left=n1;
		n.right=n2;
		n1.left=n3;
		n1.right=n4;
		
		int i=0;
		
			i=exploreNode(n);
		
		
			//arr=exploreRight(n.right,arr,i);
		

		System.out.println(i+1);
	}

	private static int exploreNode(Node n) {
		// TODO Auto-generated method stub
		
		
		System.out.println("exploring="+n.data);
		int nodeh=1;
		int lefth=0;
		int righth=0;
		if(n.left!=null) {
			//System.out.prntln("level "+i);
			//System.out.println("explored="+n.data);
			//n=n.left;
			//i++;
			lefth+=exploreNode(n.left);
			System.out.println("left height at="+n.data+"="+lefth);
		
		}
		if(n.right!=null) {
		
			//System.out.println("explored="+n.data);
			//right_height++;
			//i++;
			righth+=exploreNode(n.right);
			System.out.println("right height at="+n.data+"="+righth);
		}
		//System.out.println(i);
		
		return (lefth+ righth+nodeh);
	}



	
}
