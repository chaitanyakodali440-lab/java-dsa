package Day10;

public class BSTsearch {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    static boolean search (Node root, int target){
        if(root == null)
            return false;
        if(root.data == target)
            return true;
        if(target < root.data)
            return search(root.left, target);
        return search(root.right, target);
    }
    public static void main(String[] args){
        Node root = new Node(40);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int target = 60;

        if(search(root, target))
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
