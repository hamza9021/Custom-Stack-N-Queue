import java.util.Stack;

public class QueueUsingStackRemoveEfficient {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStackRemoveEfficient() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int remove(){
        return first.pop();
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }

    public int peek() throws Exception{
        return first.pop();
    }
}
