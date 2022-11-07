import java.util.*;
class LinkedList{
    static Node head;
    class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
            this.next = null;
        }
    }
    public void insert(int val)
    {
        if(head == null)
        {
            Node nn = new Node(val);
            head = nn;
        }
        else {
            Node nn = new Node(val);
            Node curr = head;
            while(curr.next!=null)
            {
                curr = curr.next;
            }
            curr.next = nn;
        }
    }
    public static void display()
    {
        Node curr = head;
        while(curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
    public static void delete(int index)
    {
        Node curr = head,prev = null;
        if(index == 0)
        {
            head = head.next;
            return;
        }
        while(index > 0 && curr.next!=null)
        {
            prev = curr;
            curr = curr.next;
            index--;
        }
        if(index > 0)
        {
            System.out.println("Index Out of Bound");
            return;
        }
        prev.next = curr.next;
    }
    public void insertAtpos(int index,int val)
    {
        Node curr = head;
        Node nn = new Node(val);
        if(index == 0)
        {
            nn.next = head;
            head = nn;
            return ;
        }
        index = index-1;
        while(index > 0 && curr.next != null)
        {
            curr = curr.next;
            index--;
        }
        if(index != 0)
        {
            System.out.println("Index out of Bound and appended at the end....");
        }
        nn.next = curr.next;
        curr.next = nn;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
//        ll.display();
        ll.delete(2);
//        ll.insertAtpos(6,30);
        ll.display();
    }
}