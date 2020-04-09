package Queue;


class Queue{
    private static int front,rear,nItems;
    private static long queue[];
    private int maxSize;
    Queue(int maxSize){
        this.maxSize=maxSize;
        front=0;
        queue=new long[maxSize];
        rear=-1;
        nItems=0;
    }

    public void insert(long l){
        if (rear==maxSize-1){
            rear=-1;
        }
        queue[++rear]=l;
        nItems++;
    }

    public long remove(){
        long temp=queue[front++];
        if (front==maxSize){
            front=0;
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queue[front];
    }
    public boolean isEmpty(){
        return (nItems==0);
    }
    public boolean isFull(){
        return (nItems==maxSize);
    }
    public int size(){
        return nItems;
    }

}

public class Queue_Array {

    public static void main(String[] args) {
            Queue queue=new Queue(100);
    }
}
