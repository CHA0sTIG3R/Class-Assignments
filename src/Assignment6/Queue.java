package Assignment6;

import java.util.Arrays;

public class Queue {
    private int [] elements;
    private int size;

    public Queue(int cap){
        this.elements = new int [cap];
    }

    public Queue(){
        this(8);
    }

    public void enqueue(int v){
        if (size >= elements.length){
            elements = Arrays.copyOf(elements, size*2);
        }
        this.elements[size] = v;
        size++;
    }
    
    public int dequeue(){
        int v = elements[0];
        size--;
        for (int i = 0; i < elements.length - 1; i++){
            elements[i] = elements[i + 1];
        }

        return v;
    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return this.size;
    }

}
