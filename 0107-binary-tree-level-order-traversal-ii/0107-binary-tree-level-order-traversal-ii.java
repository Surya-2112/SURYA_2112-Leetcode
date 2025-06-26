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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<TreeNode> list=new ArrayList<>();
        if(root!=null)
        list.add(root);
        while(list.size()>0)
        { List<TreeNode> l=new ArrayList<>();
          List<Integer> l1=new ArrayList<>();
           while(list.size()>0)
           {  TreeNode node=list.remove(0);
              l1.add(node.val);
              if(node.left!=null)
              l.add(node.left);
              if(node.right!=null)
              l.add(node.right);
           }
           list=l;
           ans.add(0,l1);
        }
        return ans;
    }
}