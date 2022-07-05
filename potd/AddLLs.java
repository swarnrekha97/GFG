
public class AddLLs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9901
		//237
		//10138
		
		Node n1=new AddLLs.Node(9);
		
		Node n2=new AddLLs.Node(9);
		n1.next=n2;
		Node n3=new AddLLs.Node(0);
		n2.next=n3;
		Node n4=new AddLLs.Node(1);
		n3.next=n4;
		
		Node l1=new AddLLs.Node(2);
		Node l2=new AddLLs.Node(3);
		l1.next=l2;
		Node l3=new AddLLs.Node(7);
		l2.next=l3;
		l3.next=null;
		
		printList(n1);
		System.out.println();
		printList(l1);
		
		n1=reverseList(n1);
		//System.out.println(n1.data+" ");
		l1=reverseList(l1);
		printList(n1);
		System.out.println();
		printList(l1);
		
		Node res=addList(n1,l1);
		printList(res);
		
	}

	
	private static AddLLs.Node addList(AddLLs.Node n1, AddLLs.Node l1) {
		// TODO Auto-generated method stub
		Node current = null;
		Node prev=null;
		//Node next=null;
		int carry=0;
		Integer sum;
		while(n1!=null && l1!=null) {
			int d1=n1.data;
			int d2=l1.data;
			n1=n1.next;
			l1=l1.next;
			sum=carry+d1+d2;
			
			
			if(sum>=10) {
				carry=Integer.parseInt(""+sum.toString().charAt(0));
				sum=Integer.parseInt(""+sum.toString().charAt(1));
				//System.out.println(carry);	
			}
			
			current=new Node();
			current.data=sum;
			current.next=prev;
			prev=current;
			//System.out.println(d1+"+"+d2+"="+sum);
			
					
		}
		if(n1!=null) {
			current=new Node();
			sum=carry+n1.data;
			if(sum>=10) {
				carry=Integer.parseInt(""+sum.toString().charAt(0));
				sum=Integer.parseInt(""+sum.toString().charAt(1));
				//System.out.println(carry);	
			}
			current.data=sum;
			current.next=prev;
			//System.out.println(sum);
			prev=current;
			n1=n1.next;
		}
		
		if(l1!=null) {
			current=new Node();
			sum=carry+l1.data;
			if(sum>=10) {
				carry=Integer.parseInt(""+sum.toString().charAt(0));
				sum=Integer.parseInt(""+sum.toString().charAt(1));
				//System.out.println(carry);	
			}
			current.data=sum;
			current.next=prev;
			//current.data=carry+l1.data;
			//System.out.println(sum);
			prev=current;
			l1=l1.next;
		}
		
		if(carry!=0) {
			current=new Node();
			current.data=carry;
			current.next=prev;
			//System.out.println(carry);
		}
		
		return current;
	}


	static void printList(Node node)
	    {
		//System.out.println("");
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	        System.out.println();
	    }
	
	static Node reverseList(Node n) {
		Node current=n;
		Node previous=null; // 9 9 0 1 null
		Node next=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			//current.next=temp;
					
			previous=current;
			current=next;
		}
		n=previous;
		
		return n;
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
