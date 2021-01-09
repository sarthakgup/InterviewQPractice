public class SLL
{
    public static void main(String[] args)
    {
        Node head = new Node(10);
        Node current = new Node();
        current = head;

        System.out.println(head.valueOfNode);
        System.out.println("Ready");
        append(head, 22);
        current = current.next;
        System.out.println(current.valueOfNode);

        // Creating linked list
        //head = new Node(10);
        Node currentPointerForHead;
        currentPointerForHead = head;

        for(int i = 0; i < 10; i++)
        {
            append(currentPointerForHead, 10);
            currentPointerForHead = currentPointerForHead.next;
        }

        head = currentPointerForHead;

        System.out.println("Result: ");
        System.out.println(head.valueOfNode);
        
        //resetting currentpointerforhead back to head for the following loop:
        currentPointerForHead = head;

        while(currentPointerForHead.next != null)
        {
            System.out.print(head.valueOfNode + ", ");
        }

        System.out.println("end of linked list");
    }

    // method takes head of a list and returns length
    public static int length(Node headOfList)
    {
        int lenCounter = 0;

        while(headOfList.next != null)
        {
            lenCounter++;
            headOfList = headOfList.next;
        }

        // returning length of linked list
        return lenCounter;
    }

    /*
        Method takes a linkedlist head and appends a node of 'value' to the end
        Returns: updated linked list
    */
    public static Node append(Node headOfList, int value)
    {
        Node current;
        current = headOfList;

        Node myNode = new Node(value);

        while(current.next != null)  // Looping till end of linked list
        {
            current = current.next;
        }

        current.next = myNode;

        return current;
    }

    // Method takes head and removes last node
    // Returns updated linked list
    public static Node remove(Node headOfList)
    {
        Node current;
        current = headOfList;

        //jumping to node before the last node
        for(int i = 0; i < length(headOfList) - 1; i++)
        {
            current = current.next;
        }

        current.next = null;

        return current;
    }

    /*
        Given a linked list, remove nth node
        Return updated linked list
    */
    public static Node removeNthNode(Node headOfList, int nPos)
    {
        Node current;
        current = headOfList;

        Node afterCurrent;

        if(current.next != null)
        {
            for(int i = 0; i < nPos - 1; i++)
            {
                current = current.next;
            }
        }

        afterCurrent = current.next;
        afterCurrent = afterCurrent.next;
        current.next = afterCurrent;

        // returning updated linked list
        return current;
    }

    public static Node insertAtStart(Node headOfList, Node toInsert)
    {
        Node insertion;
        insertion = toInsert;

        insertion.next = headOfList;

        // Returning updated linked list
        return insertion;
    }

    public static Node insertAtNth(Node headNode, Node toInsert, int nPos)
    {
        Node current;
        current = headNode;

        // creating two pointers for insertion
        Node insertedPrev;
        Node insertedNext;

        if(nPos == 1)
        {
            return insertAtStart(headNode, toInsert);
        }
        else
        {
            // looping to nth pos
            for(int i = 0; i < nPos; i++)
            {
                current = current.next;
            }

            insertedPrev = current;
            insertedNext = current.next.next;

            // now inserting the node
            current.next = toInsert;
            current.next = insertedNext;

            // returning updated linked list
            return current;
        }
    }

    /*
        Takes a head parameter and removes n nodes from the end of the linked list
        Returns: updated linked list
    */
    public static Node removeNNumberOfNodes(Node headListNode, int nVal)
    {
        Node current;
        current = headListNode;

        for(int i = 0; i < length(current) - nVal; i++);
        {
            current = current.next;
        }
        
        current.next = null;

        // returning updated linked list
        return current;
    }

    public static class Node
    {
        Node prev;
        Node next;
        int valueOfNode;

        Node (int paramData)
        {
            int dataVar = 0;
            dataVar = paramData;
            valueOfNode = dataVar;
            prev = null;
            next = null;
        }
        Node ()
        {
            prev = null;
            next = null;
        }
    }
}