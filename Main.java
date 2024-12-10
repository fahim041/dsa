import ds.StaticArray;

public class Main {
    public static void main(String[] args){
        var playground = new StaticArray(4);
        playground.push(4);
        playground.push(11);
        playground.push(2);
        playground.push(7);

        playground.print();
    }
}
