package Day8;

public class InsertBeginning {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    static Node insertAtBeginning(Node head, int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }
    static void display(Node head){

        Node current = head;
        while(current != null){
            System.out.println("The value of Node is "+ current.data);
            current = current.next;
        }
    }
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = insertAtBeginning(head,5);
        display(head);
    }
}
