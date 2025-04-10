package org.example;

public class Stack {
    //у стека обычно фикс размер (5)
   static int max_size = 5;
   static int size = 0;
   //для хранения эл стека исп массив, равный 5
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
//удаляем эл из стека и возаращаем его пользователю, что он мог увидеть этот эл
    static int pop() {
       //проверяем, а если стек пуст? отображаем ошибку
        if(size == 0) {
            throw new RuntimeException("Stack is empty!");
        }
        //берем верхний эл стека - эл с индексом size (самый посл эл)
        // т к size увелич после того, как мы кладем значен эл (в методе push size++
        //идет после data[size] = value), нам нужно обращаться size - 1
        //иначе мы получим ячейку, кот еще не заполнена значением
       int result =  data[size - 1];//получаем эл массива и сохр в result, чтобы потом вернуть знач result (чтобы показать эл пользователю)
                //уменьшаем тек размер стека
        size--;
        //возвра значение эл, чтобы показать его польз
        return  result;
    }

// доб эл в стек - принимает значение и кладет его на вершину стека
    static void push(int value) {
       //сначала проверяем, не превышен ли макс размер стека
        // если превышен отображаем ошибку
        if(size >= max_size) {
            throw new RuntimeException("Stack is full!");
        }
        //если стек еще не полный кладем новое значение в массив data
        data[size] = value;
        //увелич счетчик на 1
size++;
    }


    //позв отобразить самый верхн эл, но не удаляет его
    static int peek() {
        if(size == 0) {
            throw new RuntimeException("Stack is empty!");
        }
        //сразу же возвр значение польз, записывать в переменную не будем, лишняя строчка кода
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