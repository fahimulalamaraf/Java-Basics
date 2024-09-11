import java.util.*;

public class LinkedList {

    public static class Node{
        int data;
        Node next;
       
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    
    public void addLast(int data)
    {
        // Creating New Node
        Node newNode = new Node(data);
        
        //Checking if the New Node is the first one?
        if( head == null)
        {
            head = tail = newNode;
        }

        // Pointing the current tail node toward the New Node
        tail.next = newNode;

        //mnaking our New Node as the tail Node
        tail = newNode;
    }
    
    public void addFirst(int data)
    {
        // Creating New Node
        Node newNode = new Node(data);
        
        //Checking if the New Node is the first one?
        if( head == null)
        {
            head = tail = newNode;
        }

        // Pointing the new node to previous head node
       newNode.next = head;

        //mnaking our New Node as the Head Node
        head = newNode;
    }
    

    public static void main(String[] args) {
        
       LinkedList ll = new LinkedList();
       ll.addFirst(1);
       ll.addFirst(2);
       ll.addLast(3);
       ll.addLast(4);
    }
}
