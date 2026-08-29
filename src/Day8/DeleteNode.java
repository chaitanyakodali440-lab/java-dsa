package Day8;

public class DeleteNode {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    static Node delete(Node head, int value){
        if(head==null)
            return null;
        if(head.data == value)
            return head.next;
        Node current = head;
        while(current.next != null){
            if(current.next.data == value){
                current.next = current.next.next;
                break;
            }

            current = current.next;
        }
        return head;
    }
    static void display(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = delete(head,20);

        display(head);
    }
}
