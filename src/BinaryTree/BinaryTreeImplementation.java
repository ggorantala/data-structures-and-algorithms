package BinaryTree;

public class BinaryTreeImplementation {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        //    System.out.println(tree);
        //    System.out.println(tree.find(9));
        //    tree.preOrderTraversal();
        //    tree.inOrderTraversal();
        //    tree.postOrderTraversal();
        System.out.println(tree.min());
    }
}

class BinaryTree {
    private TreeNode root;

    public void insert(int value) {
        var newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            return;
        }

        var current = root;

        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                }
                current = current.right;
            }
        }
    }

    public boolean find(int value) {
        var current = root;

        while (current != null) {
            if (value > current.value) {
                current = current.right;
            } else if (value < current.value) {
                current = current.left;
            } else {
                return true;
            }
        }
        return false;
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.println(root.value);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        preOrderTraversal(root.left);
        System.out.println(root.value);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.println(root.value);
    }

    public int height() {
        return height(root);
    }

    private int height(TreeNode root) {
        if (root == null || isLeaf(root)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public int min() {
        return min(root);
    }

    private int min(TreeNode root) {
        if (isLeaf(root)) return root.value;

        var left = min(root.left);
        var right = min(root.right);

        return Math.min(Math.min(left, right), root.value);
    }

    public int minBST() {
        return minBST(root);
    }

    // if the tree is BST, then we just case for the left most child node for min val
    private int minBST(TreeNode root) {
        if (root == null) throw new IllegalStateException("Tree is empty");

        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.left;
        }

        return last.value;
    }

    public boolean equals(TreeNode other) {
        if (other == null) {
            return false;
        }
        return equals(root, other);
    }

    private boolean equals(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }

        if (t1 != null && t2 != null)
            return (t1.value == t2.value) && equals(t1.left, t2.left) && equals(t1.right, t2.right);

        return false;
    }

    private static class TreeNode {
        private final int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }
}
