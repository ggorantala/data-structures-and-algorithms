package BinaryTree;

public class BinaryTreeImplementation {
  public static void main(String[] args) {
    Tree tree = new Tree();
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
  }
}

class Tree {
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
