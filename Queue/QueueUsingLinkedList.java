package Queue;

import java.util.*;

public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    static class Queue {
     static Node front;
     static Node rear;

     public static boolean isEmpty(){
        return front == null && rear == null;
     }

     public static void add(int data){
        Node newNode = new Node(data);
        
        if (isEmpty()) {
            front = rear = newNode;
        }else{
           rear.next = newNode;
           rear = newNode;
        }
     }

     public static int remove(){
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return -1;
        }
        int result = front.data;
        //for 1 element
        if (front == rear) {
            front = rear = null;
        }else{
            front = front.next;
        }
        return result;
 
     }
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty!!");
                return -1;
            }

            return front.data;
        }
    }

    public static void main(String[] args) {
     Queue q = new Queue();
     q.add(1);
     q.add(2);
     q.add(3);

    //  while (!q.isEmpty()) {
    //     System.out.println(q.peek());
    //     q.remove();
    //  }

    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.isEmpty());
    System.out.println(q.peek());

    
    }
}
