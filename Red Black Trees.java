enum Color {
    RED,
    BLACK
}

class Node {
    int data;
    Node parent;
    Node left;
    Node right;
    Color color;

    public Node(int data) {
        this.data = data;
        parent = null;
        left = null;
        right = null;
        color = Color.RED;
    }
}

public class RedBlackTree {
    private Node root;
    private Node nil;

    public RedBlackTree() {
        nil = new Node(0);
        nil.color = Color.BLACK;
        root = nil;
    }

    // Implement the necessary methods for insertion, deletion, and other operations

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();

        // Insert nodes into the tree
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
    }
}
