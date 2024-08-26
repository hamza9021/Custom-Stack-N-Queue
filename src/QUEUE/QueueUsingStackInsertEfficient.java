import java.util.Stack;

public class QueueUsingStackInsertEfficient {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStackInsertEfficient() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        first.add(item);
    }
    public int remove(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!!!");
        }

        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peek = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peek;

    }
    public static void main(String[] args) {

    }
}
