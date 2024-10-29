package ds;

public class StaticArray {
    private int[] arr;
    private int capacity;
    private int size;

    public StaticArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    public void push(int val){
        if(size >= capacity){
            System.out.println("Array is full!");
        }
        arr[size] = val;
        size++;
    }

    public int pop(){
        if(size <= 0){
            System.out.println("Array is empty!");
        }
        int val = arr[size];
        size--;
        return val;
    }

    public int get(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return -1;
        }
        return arr[index];
    }

    public int getSize(){
        return size;
    }

    public void print(){
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }
}
