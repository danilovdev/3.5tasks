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
    public String tree2str(TreeNode root) {
        // Если узел пустой, то вовзращаем пустую строку
        if (root == null) { return ""; }
        // Если узел лист, то возвращаем только значение
        if (root.left == null && root.right == null) { 
            return root.val + "";
        }
        // Если у узла есть только левое поддерево, то добавляем скобочки только для левого поддерева
        if (root.right == null) { 
            return root.val + "(" + tree2str(root.left) + ")";
        }
        // По умолчанию добавляем скобочки для левого и правого поддеревьев
        return root.val + "(" + tree2str(root.left) + ")" +
            "(" + tree2str(root.right) + ")";
    }
}