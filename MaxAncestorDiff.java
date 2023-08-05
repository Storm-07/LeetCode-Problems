/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans =0;
    public int maxAncestorDiff(TreeNode root) {
        preOrder(root,root.val,root.val);
        return ans;
        
    }
    public void preOrder(TreeNode root,int min,int max){
      if(root == null) return;
      max =Math.max(max,root.val);
      min =Math.min(min,root.val);
      if(root.left == null && root.right == null){
          ans = Math.max(ans,Math.abs(max - min));
          return;
      }
      preOrder(root.left,min,max);
      preOrder(root.right,min,max);

    }
}
