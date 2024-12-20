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

        int val = arr[size - 1];
        size--;
        return val;
    }

    public void insertMiddle(int index, int val){
        if(index >= capacity){
            System.out.println("Array is full");
            return;
        }

        if(index < 0 || index >= size){
            System.out.println("Index is out of bound");
            return;
        }

        for(int i = size - 1; i >= index; i--){
            arr[i + 1] = arr[i];
        }

        arr[index] = val;
        size++;
    }

    public int removeMiddle(int index){
        if(index < 0 || index >= size){
            System.out.println("Index out of bound");
            return -1;
        }

        int val = arr[index];
        for(int i = index + 1; i < size; i++){
            arr[i - 1] = arr[i];
        }
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
