package com.bharath.learning.core.collections.list.linkedlist;

public class CustomLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // if head is null then it means the list is empty
            //  then the new node will become the head of the list
            head = newNode; // head -> newNode
        } else {
            // if head is not null, it means there are elements in the list
            // then traverse to the end of the list and add the new node
            Node temp = head; // temp node to traverse the list to the end of the list
            // temp -> head
            // temp -> 10 -> 20 -> 30 -> 40 -> 50 -> null
            while (temp.next != null) { // traverse till the end of the list
                temp = temp.next; // temp -> next node
                // temp -> next node
            }
            temp.next = newNode; // temp -> newNode
        }
    }


    public void printList() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // delete node by value
    public void deleteNodeByValue(int value) {
        //if list is empty, nothing to delete, just return
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // if head or first node to be deleted, then move head to next node
        // head -> 10 -> 20 -> 30 -> 40 -> 50 -> null
        // delete 10
        // head -> 20 -> 30 -> 40 -> 50 -> null
        if (head.data == value) {
            head = head.next;
            return;
        }

        // if the node to be deleted is not the head node
        // traverse the list and find the node to be deleted
        // temp -> 10 -> 20 -> 30 -> 40 -> 50 -> null
        // delete 30
        // temp -> 10 -> 20 -> 40 -> 50 -> null
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Node not found");
            return;
        }

        // if the node to be deleted is found
        // LL before deletion: temp -> 10 -> 20 -> 30 -> 40 -> 50 -> null
        temp.next = temp.next.next;// head -> 10 -> 20 -> 40 -> 50 -> null
    }

    public boolean contains(int value) {
      Node temp = head;
      while (temp != null) {
          if (temp.data == value) {
              return true;
          }
          temp = temp.next;
      }
        return false;
    }

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);// create a new node // newNode -> data // 5 -> null
        if (head == null) {
            // if the list is empty, then the new node will become the head of the list
            head = newNode;
        } else {
            // if the list is not empty, then the new node will become the head of the list
            // if list is already having elements like head -> 20 -> 30 -> 40 -> 50 -> null
            newNode.next = head; // newNode -> head -> 20 -> 30 -> 40 -> 50 -> null
            head = newNode; // head -> newNode -> 20 -> 30 -> 40 -> 50 -> null
        }
    }


    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(10);
        customLinkedList.add(20);
        customLinkedList.add(30);
        customLinkedList.add(40);
        customLinkedList.add(50);
        customLinkedList.printList();

        customLinkedList.deleteNodeByValue(10);
        customLinkedList.printList();
        customLinkedList.deleteNodeByValue(30);
        customLinkedList.printList();

        System.out.println(customLinkedList.contains(20));
        System.out.println(customLinkedList.contains(50));
        System.out.println(customLinkedList.contains(30));

        customLinkedList.addFirst(5);
        customLinkedList.printList();
    }


}
