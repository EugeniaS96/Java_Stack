package org.example;

public class Stack {
   static int max_size = 5;
   static int size = 0;
   static int[] data = new int[max_size];

   public static void main(String[] args) {
       push(3);
       push(2);
       push(1);
       push(4);
       push(5);
       print();
       System.out.println(peek());
       System.out.println(pop());
       System.out.println(pop());
       print();
    }

    static int pop() {
        if(size == 0) {
            throw new RuntimeException("Stack is empty!");
        }

       int result =  data[size - 1];
        size--;
        return  result;
    }
    static void push(int value) {
        if(size >= max_size) {
            throw new RuntimeException("Stack is full!");
        }
size++;
    }

    static int peek() {
        if(size == 0) {
            throw new RuntimeException("Stack is empty!");
        }
       return data[size - 1];
    }

    static void print() {
       System.out.println("___");
       if(size > 0) {
           for(int i = size - 1; i >= 0; i--) {
               System.out.println("!" + data[i] + "!");
           }
       }
       System.out.println("___");
    }

    static boolean isEmpty() {
       return size == 0;
    }
}
