package BinaryTrees.BinaryTreelec1;

public class SumOfNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int lc = sum(root.left);
        int rc = sum(root.right);

        return (lc + rc) + root.data;

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        // System.out.println(root.data);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(4);
        root.left.right = new Node(7);

        System.out.println(sum(root));
    }
}
