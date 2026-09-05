package BinaryTrees.BinaryTreelec2;

import org.w3c.dom.Node;

public class DiameterOfTree {
     static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }    
    }
    //height by node convention
    public static int height(Node root){
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }


    //Diameter of a tree
    public  static int diameter(Node root){  //O(n^2)
        if (root == null) {
            return 0;
        }
       int ld = diameter(root.left);
       int lh = height(root.left);
       int rd = diameter(root.right);
       int rh = height(root.right);
       int self = lh + rh + 1;
       return Math.max(self, Math.max(ld, rd));
        
    }


    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
System.out.println(diameter(root));
    }
}
