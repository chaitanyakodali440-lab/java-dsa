package Day10;

public class BSTexample {
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args){
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);
        System.out.println("Root = " + root.data);
    }
}





