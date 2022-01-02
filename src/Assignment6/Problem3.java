package Assignment6;

public class Problem3 {
    public static void main(String[] args) {
        Queue myQueue = new Queue();

        for (int i = 1; i <=20; i++){
            myQueue.enqueue(i);
        }

        System.out.println(myQueue.getSize());

        for (int i = 0; i < 20; i++){
            System.out.println(myQueue.dequeue());
        }

        System.out.println(myQueue.empty());
    }
}
