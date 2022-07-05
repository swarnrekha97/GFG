

public class ReverseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node n=new Node(1);
Node n1=new Node(0);
Node n2=new Node(9);
Node n3=new Node(9);

n.next=n1;
n1.next=n2;
n2.next=n3;
			reverseLL(n);

	}

	

	private static void reverseLL(ReverseLL.Node n) {
		// TODO Auto-generated method stub
		if(n==null) {
			return;
		}
		else
		{
			reverseLL(n.next);
		System.out.println(n.data);
		}
	}



	static class Node{
		int data;
		Node next;
		//Node prev;
		
		Node(int d){
			data=d;
			next=null;
		}
		Node (){
			
		}
	}
}
