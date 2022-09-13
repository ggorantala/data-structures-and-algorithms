package tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        TreeNode C = new TreeNode(2);
        TreeNode D = new TreeNode(3);
        A.right = C;
        C.left = D;

        System.out.println(preorderTraversal(A));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        dfs(root, values);
        return values;
    }

    public static void dfs(TreeNode root, List<Integer> values) {
        if (root == null) {
            return;
        }

        values.add(root.val);
        dfs(root.left, values);
        dfs(root.right, values);
    }
}

