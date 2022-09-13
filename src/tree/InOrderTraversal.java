package tree;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        TreeNode C = new TreeNode(2);
        TreeNode D = new TreeNode(3);
        A.right = C;
        C.left = D;

        System.out.println(inOrderTraversal(A));
    }

    public static List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        dfs(root, values);
        return values;
    }

    public static void dfs(TreeNode root, List<Integer> values) {
        if (root == null) {
            return;
        }

        dfs(root.left, values);
        values.add(root.val);
        dfs(root.right, values);
    }
}
