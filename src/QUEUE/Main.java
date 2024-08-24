package QUEUE;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomQueue customqueue = new CustomQueue(4);
//
//        for (int i = 0; i < 4; i++) {
//            customqueue.insert(i);
//        }
//
//        customqueue.display();
//
//        customqueue.remove();
//
//        customqueue.display();


        CircularQueue queue = new CircularQueue(4);

        for (int i = 0; i < 4; i++) {
            queue.insert(i);
        }
        queue.display();

        queue.remove();
        queue.remove();

        queue.display();

        queue.insert(9);
        queue.insert(9);
        queue.display();




    }
}
