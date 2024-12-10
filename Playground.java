public class Playground {
    private int capacity;
    private int[] arr;
    private int size;

    public Playground(int capacity){
        this.capacity = capacity;
        arr = new int[this.capacity];
        size = 0;
    }

    public void push(int val){
        if(size >= capacity) {
            System.out.println("Array is full");
            return;
        }
        arr[size] = val;
        size++;
    }

    public int pop(){
        if(size <= 0){
            System.out.println("Array is empty");
            return -1;
        }
        int val = arr[size - 1];
        size--;
        return val;
    }

    public int get(int index){
        if(index < 0 || index >= size){
            System.out.println("Index out of bound");
            return -1;
        }
        return arr[index];
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

    public void insertMiddle(int index, int val){
        if(index >= capacity){
            System.out.println("Array is full");
            return;
        }

        if(index < 0 || index >= size){
            System.out.println("Array is out of bound");
            return;
        }

        for(int i = size - 1; i >= index; i--){
            System.out.println("i " + i);
            arr[i + 1] = arr[i];
        }
        arr[index] = val;
        size++;
    }


    public int size(){
        return size;
    }

    public void print(){
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }
}
