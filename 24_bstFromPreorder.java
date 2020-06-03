public class BSTfromPreorder {
    public class TreeNode {
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
    
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0)
            return null;
        
        TreeNode root = new TreeNode(preorder[0]);
        
        if(preorder.length == 1)
            return root;
        
        Stack<TreeNode> bst = new Stack<TreeNode>();
        TreeNode temp;
        
        bst.push(root);
        
        for(int i = 1; i<preorder.length; i++)
        {
            temp = null;
            
            while(!bst.isEmpty() && preorder[i] > bst.peek().val)
                temp = bst.pop();
            
            if(temp != null)
            {
                temp.right = new TreeNode(preorder[i]);
                bst.push(temp.right);   
            }
            else
            {
                temp = bst.peek();
                temp.left = new TreeNode(preorder[i]);
                bst.push(temp.left);
            }
        }
        
        return root;
    }
 
}
