package ds;

public class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size;

    public DynamicArray(){
        this.capacity = 2;
        arr = new int[this.capacity];
        size = 0;
    }

    public void push(int val){
        if(size >= capacity){
            resize();
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

    public int getSize(){
        return size;
    }

    public void print(){
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }

    private void resize(){
        capacity = capacity * 2;
        int[] newArr = new int[capacity];

        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
