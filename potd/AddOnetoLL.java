
public class AddOnetoLL {

	

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=999999; int output=1000000;
		Node n= new Node();
		n.data=4;
		
		Node n1= new Node();
		n1.data=5;
		
		Node n2= new Node();
		n2.data=6;
		
		Node n3= new Node();
		n3.data=9;
		
		Node n4= new Node();
		n4.data=9;
		
		Node n5= new Node();
		n5.data=9;
		
		n.next=n1;
		n1.next=n2;
		n2.next=null;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		
		Node head=n;
		Node start=head;
		String data="";
		int digitStart=0;
		while (start!=null) {
			data=data+""+start.data;
			start=start.next;
			digitStart++;
		}
		
System.out.println(Integer.parseInt(data));

long sum=Long.parseLong(data)+1;
int digitEnd=String.valueOf(sum).length();
int i=0;
Node s2=head;
Node s3=head;
if(digitEnd>digitStart) {
	while(s3.next!=null) {
		s3=s3.next;
	}
	s3.next= new Node(Integer.parseInt(""+String.valueOf(sum).charAt(i)));
}
while (s2!=null) {
	//System.out.println(String.valueOf(sum).charAt(i));
	//System.out.println(s2.data);
	s2.data=Integer.parseInt(""+String.valueOf(sum).charAt(i));
	//System.out.println(s2.data);
	s2=s2.next;
	i++;
}

while(head!=null) {
	System.out.println(head.data);
	head=head.next;
}


	}
}


class Node{
	int data;
	Node next;
	
	Node(int d){
		data=d;
		next=null;
	}
	Node (){
		
	}
}