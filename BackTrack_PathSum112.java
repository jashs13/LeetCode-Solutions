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

// Notes 
// This question has only one trick: Solve it like a normal backtrack method 
// But we can just add a condition as soon as it reached the leaf node that c == targetSum.
// This will return the path to the leaf node containing the target sum condition. 



class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int curr_count = 0;
        return helper(root, curr_count, targetSum);
        
        
    }

    public boolean helper(TreeNode root, int c, int targetSum){
        if(root == null){
            return false;
        }
        c = c + root.val;
        if(root.left == null && root.right == null && c == targetSum){ //only one modification from path finding to the leaf node
            return true;
        }
        if(helper(root.left, c, targetSum)){ 
            return true;
        }
        if(helper(root.right, c, targetSum)){
            return true;
        }
        //main backtracking steps 
        c = c - root.val;
        return false;
        
        
    }
}