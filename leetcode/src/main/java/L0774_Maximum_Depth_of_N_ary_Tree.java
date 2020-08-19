import common.Node;
import java.util.List;

// https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class L0774_Maximum_Depth_of_N_ary_Tree {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        if (root.children == null || root.children.size() == 0) return 1;
        int max = 0;
        for (Node child : root.children) {
            max = Math.max(maxDepth(child), max);
        }
        return max + 1;
    }
}