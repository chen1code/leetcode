/*
Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
*/

"""
分别查看当前节点的左右子树是否为空，为空加入路径，否则继续其子节点

Solution -- Java

"""
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> re = new ArrayList<String>();
        if(root != null){
            search_B(root, "", re);
        }
        return re;
    }
    public void search_B(TreeNode root, String path, List<String> re){
        if(root.left == null && root.right == null) re.add(path + root.val);
        if (root.left != null) search_B(root.left, path + root.val + "->", re);
        if (root.right != null) search_B(root.right, path + root.val + "->", re);
    }
}
