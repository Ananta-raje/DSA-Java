package BinaryTrees.BinaryTreelec1;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTrees.BinaryTrees1.BinaryTree;

public class BinaryTrees1 {

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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // 1)preorder treversal --O(n) complexity
        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // 2)Inorder treversal
        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);

            System.out.print(root.data + " ");

            inOrder(root.right);
        }

        // 3)Postorder treversal
        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // 4)Level order traversal
        public static void levelOrder(Node root){
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);

                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

    }


    // // Creating the binary tree
    // public static void main(String[] args) {

    //     Node root = new Node(10);

    //     root.left = new Node(5);
    //     root.right = new Node(20);

    //     root.left.left = new Node(3);
    //     root.left.right = new Node(7);
        

    // }

    public static void main(String[] args) {
    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};//Build tree for
    //given preorder sequence O(n)
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);
    // System.out.println(root.data);
    // tree.preOrder(root);
    // System.out.println();
    // tree.inOrder(root);
    // System.out.println();
    // tree.postOrder(root);
    // System.out.println();
    tree.levelOrder(root);

    }
}