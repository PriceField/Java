package tree;

public class BinaryTree {
    Node root;

    public BinaryTree(int value) {
        root = new Node(value);
    }

    public BinaryTree() {
        root = null;
    }

    public static void main(String args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(3);
        binaryTree.root.left = new Node(4);
        binaryTree.root.right = new Node(5);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.key);
        inOrder(root.right);
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.key);
        inOrder(root.left);
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        inOrder(root.right);
        System.out.println(root.key);
    }
}
