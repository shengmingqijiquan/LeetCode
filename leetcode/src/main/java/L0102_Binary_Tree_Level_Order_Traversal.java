import common.Node;
import java.util.List;
import java.util.ArrayList;
import common.TreeNode;

// https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class L0102_Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> current = new ArrayList<>();

            // 当前层的元素个数
            int length = queue.size();
            for (int i = 0; i < length; ++i) {
                TreeNode node = queue.remove();

                // 放入结果
                current.add(node.val);

                // 依次将 node 的左右子节点加入队列
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            ans.add(current);
        }
        return ans;
    }
}