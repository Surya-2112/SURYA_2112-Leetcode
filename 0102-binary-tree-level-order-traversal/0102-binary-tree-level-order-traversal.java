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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<TreeNode> list=new ArrayList<>();
        if(root!=null) list.add(root);
        while(list.size()>0)
        {
            List<Integer> l=new ArrayList<>();
            List<TreeNode> l1=new ArrayList<>();
            while(list.size()>0)
            {
                TreeNode node=list.remove(0);
                l.add(node.val);
                if(node.left!=null) l1.add(node.left);
                if(node.right!=null) l1.add(node.right);
            }
            list=l1;
            ans.add(l);
        }  
        return ans;
    }
}