package tree;

public class Node {
    Node left;
    Node right;
    int key;

    public Node(int value) {
        key = value;
        left = right = null;
    }
}
