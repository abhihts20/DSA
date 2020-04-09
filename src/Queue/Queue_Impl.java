package Queue;

class Queues {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    public Queues(int s)         // constructor
    {
        maxSize = s + 1;                 // array is 1 cell larger
        queArray = new long[maxSize];  // than requested
        front = 0;
        rear = -1;
    }

    public void insert(long j)  // put item at rear of queue
    {
        if (rear == maxSize - 1) rear = -1;
        queArray[++rear] = j;
    }

    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize) front = 0;
        return temp;
    }
    public long peek(){
        return queArray[front];
    }
    public boolean isEmpty(){
        return (rear+1==front||front+maxSize-1==rear);
    }
    public boolean isFull(){
        return (rear+2==front||front+maxSize-2==rear);
    }
    public int size(){
        if (rear>=front){
            return rear-front+1 ;

        }
        else
        {
            return (maxSize-front)+(rear+1);
        }
    }
}

public class Queue_Impl {
    public static void main(String[] args) {

    }

}
