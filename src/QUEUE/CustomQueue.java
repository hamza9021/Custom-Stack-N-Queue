package QUEUE;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public void insert(int item){
        if(isFull()){
            System.out.println("QUEUE IS FULL!!!");
            return;
        }
        data[end] = item;  //-->    data[end++]
        end++;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!!!!");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!!!");
        }
        return data[0];
    }

    public void display(){
        for (int i=0;i<end;i++){
            System.out.print(data[i] + " <- ");
        }
        System.out.println("End");
    }

    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
}
