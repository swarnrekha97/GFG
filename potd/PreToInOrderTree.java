
public class PreToInOrderTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//input	root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
	//	output=[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
		
		TreeNode n1=new TreeNode(5); 
		TreeNode n2=new TreeNode(3); 
		TreeNode n3= new TreeNode(6) ;
		TreeNode n4= new TreeNode(2) ;
		
		TreeNode n5= new TreeNode(4) ;
		TreeNode n6= new TreeNode(8) ;
		TreeNode n7= new TreeNode(1);
		TreeNode n8= new TreeNode(7);
		TreeNode n9=new TreeNode(9) ;
		
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n4.left=n7;
		n2.right=n5; 
		
		n3.right=n6;
		n6.left=n8;
		n6.right=n9;
		//input1= root = [5,1,7]
			//	output1= [1,null,5,null,7]
		
		printLevelOrder(n1);
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

}
	 static void printLevelOrder(TreeNode root)
	    {
	        int h = height(root);
	        int i;
	        for (i = 1; i <= h; i++)
	            printCurrentLevel(root, i);
	    }
	 
	    /* Compute the "height" of a tree -- the number of
	    nodes along the longest path from the root node
	    down to the farthest leaf node.*/
	   static int height(TreeNode root)
	    {
	        if (root == null)
	            return 0;
	        else {
	            /* compute  height of each subtree */
	            int lheight = height(root.left);
	            int rheight = height(root.right);
	 
	            /* use the larger one */
	            if (lheight > rheight)
	                return (lheight + 1);
	            else
	                return (rheight + 1);
	        }
	    }
	 
	    /* Print nodes at the current level */
	  static  void printCurrentLevel(TreeNode root, int level)
	    {
	        if (root == null)
	            return;
	        if (level == 1)
	            System.out.print(root.val + " ");
	        else if (level > 1) {
	            printCurrentLevel(root.left, level - 1);
	            printCurrentLevel(root.right, level - 1);
	        }
	    }
	 
}
