package QUEUE;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front = 0;
    int size = 0;


    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }


    public void insert(int item){
        if(isFull()){
            System.out.println("QUEUE IS FULL!!!");
            return;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
    }


    public int remove(){
        int removed = data[front++];
       front = front % data.length;
       size--;
        return removed;
    }


    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!!!");
        }
        return data[front];
    }


    public void display(){
       int i = front;
       do{
           System.out.print(data[i] + " -> ");
           i++;
           i %= data.length;
       }while(i != end);
        System.out.println("END");
    }


}
