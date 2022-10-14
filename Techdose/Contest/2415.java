class Solution {
    public void find(TreeNode left,TreeNode right,boolean lvl){
        if(right==null||left==null)return;
         if(lvl){
            int temp=right.val;
             right.val=left.val;
             left.val=temp;
        }
        find(left.left,right.right,!lvl);
        find(left.right,right.left,!lvl);
       
        
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root.left==null||root.right==null)return root;
        find(root.right,root.left,true);
     return root;
    }
}