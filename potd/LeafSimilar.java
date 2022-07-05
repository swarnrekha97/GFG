import java.util.ArrayList;
import java.util.List;





public class LeafSimilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1=new TreeNode(3); 
		TreeNode n2=new TreeNode(5); 
		TreeNode n3= new TreeNode(6) ;
		TreeNode n4= new TreeNode(2) ;
		
		TreeNode n5= new TreeNode(7) ;
		TreeNode n6= new TreeNode(4) ;
		TreeNode n7= new TreeNode(1);
		TreeNode n8= new TreeNode(9);
		TreeNode n9=new TreeNode(8) ;
		      
		n1.left=n2;
		n1.right=n7;
		n2.left=n3;
		n2.right=n4;
		n4.left=n5;
		n4.right=n6;
		n7.left=n8;
		n7.right=n9;
		
		
		
		List<Integer> leaveslist1=parseTree(n1,new ArrayList());
        //List<Integer> leaveslist2=parseTree(root2);
        //List<Integer> leaveslist2=parseTree(root2,new ArrayList());
        System.out.println(leaveslist1);
        //System.out.println(leaveslist2);
        String s="b";
        s=s.substring(0, 0);
        System.out.println(s);
        StringBuilder str= new StringBuilder(s);
        System.out.println(str.reverse());
	}

static List<String> parseTree(TreeNode root,List<String> returnlist){
        
        if(root.left!=null){
            parseTree(root.left,returnlist);
        }
        if(root.right!=null){
            parseTree(root.right,returnlist);
        }
        if(root.left==null && root.right==null)
         returnlist.add(""+root.val);
       
       
        return returnlist;
    }
    
	


	static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	      
public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        //List<Integer> leaveslist1=parseTree(root1);
        List<Integer> leaveslist1=parseTree(root1,new ArrayList());
        //List<Integer> leaveslist2=parseTree(root2);
        List<Integer> leaveslist2=parseTree(root2,new ArrayList());
        System.out.println(leaveslist1);
        
        System.out.println(leaveslist2);
       /* if(leaveslist1.equalsIgnoreCase(leaveslist2)){
            return true;
        }
        else */
            return false;
    }
    
    
}
}





