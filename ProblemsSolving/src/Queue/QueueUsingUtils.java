package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingUtils {
    Queue<Integer> queue;

    public void add(int i){
        this.queue.add(i);
    }
    public void print(){
        System.out.println();
        Iterator<Integer> itr=this.queue.iterator();

        while (itr.hasNext()){
            System.out.print(itr.next()+",");
        }
    }

    public static void main(String[] args) {
        QueueUsingUtils obj=new QueueUsingUtils();
        obj.queue=new LinkedList<>();
        obj.add(4);
        obj.add(7);
        obj.add(3);
        obj.add(8);

        obj.print();
        System.out.println("remove element from "+obj.queue.remove());
        System.out.println("head queue "+obj.queue.peek());
    }
}
