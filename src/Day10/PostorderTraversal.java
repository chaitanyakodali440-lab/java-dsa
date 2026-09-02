package Day10;

public class PostorderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    static void postorder(Node root){
        if(root == null)
            return;

        postorder(root.left);

        postorder(root.right);

        System.out.println(root.data + " ");

    }
    public static void main(String[] args){
        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.print("Postorder:");

        postorder(root);
    }
}
