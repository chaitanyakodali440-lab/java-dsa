package Day10;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {

    static class Node{

        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    static void levelorder(Node root){

        if(root==null)
            return;

        Queue<Node>queue=new ArrayDeque<>();

        queue.offer(root);

        while(!queue.isEmpty()){

            Node current=queue.poll();

            System.out.print(current.data+" ");

            if(current.left!=null)
                queue.offer(current.left);
            if(current.right!=null)
                queue.offer(current.right);
        }
    }

    public static void main(String[] args){

        Node root=new Node(10);

        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);

        System.out.print("levelorder:\n");
        levelorder(root);
    }
}