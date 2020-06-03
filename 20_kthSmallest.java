class Solution {
    int res = 0, cnt = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        
        if(root == null)
            return 0;
        
        kthSmallest(root.left,k);
                
        cnt++;
        
        if(cnt == k)
        {
            res = root.val;
            return res;
        }
        
        kthSmallest(root.right, k);
        
        return res;
    }
    
    
}