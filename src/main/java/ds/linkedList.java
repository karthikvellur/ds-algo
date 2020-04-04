package ds;

// reference: https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/

public class linkedList {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int dataParam){
            this.data = dataParam;
            this.next = null;
        }
    }

    linkedList insert(linkedList list, int data){
        Node newNode = new Node(data);

        if(list.head == null)
            list.head = newNode;
        else{
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }

            last.next =  newNode;
        }

        return list;
    }

    void printList(linkedList list){
        Node last = list.head;

        if(last == null)
            System.out.println("List is empty");
        else{
            System.out.println(last.data);
            while (last.next != null){
                last = last.next;
                System.out.println(last.data);
            }
        }
    }

    public static void main(String[] args){
        linkedList list = new linkedList();

        list.insert(list, 10);
        list.insert(list, 20);
        list.insert(list, 30);

        list.printList(list);
    }
}
