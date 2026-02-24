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
    List<String> list = new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        if(root ==  null) return 0;
        dfs(root, "");
        int res = 0;
        for(String s : list){
            if(s.equals("")) continue;
            res += Integer.parseInt(s,2);
        }
        return res;
    }
    public void dfs(TreeNode node, String s){
        if(node.left == null && node.right == null){
            list.add(s + node.val);
            return;
        }
        s += node.val;
        if(node.left != null) dfs(node.left, s);
        if(node.right != null) dfs(node.right, s);
    }
}