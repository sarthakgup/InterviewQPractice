import java.util.LinkedList;

public class DLL
{
    Node head;

    public static void main(String[] args)
    {
        System.out.println("Ready");
                
    }

    public void append(Node headListNode, int value)
    {
        Node current;
        Node myNode = new Node(value);

        current = head;
        System.out.println(myNode);

        while(current.next != null)
        {
            current = current.next;
        }

        current.next = myNode;
    }

    public class Node
    {
        Node prev;
        Node next;

        Node (int paramData)
        {
            int dataVar = paramData;
            prev = null;
            next = null;
        }
    }
}


