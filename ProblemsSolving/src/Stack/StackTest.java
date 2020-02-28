package Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {
    Stack<Integer> stack;

    public void push(int i){
        this.stack.push(i);
    }
    public void print(){
        System.out.println();
        Iterator<Integer> itr=this.stack.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+",");
        }
    }

    public int pop(){
        return this.stack.pop();
    }
    public static void main(String[] args) {
        StackTest obj=new StackTest();
        obj.stack =new Stack<Integer>();

        obj.push(2);
        obj.push(4);
        obj.push(3);
        obj.push(6);

        System.out.println("Stack list");
        obj.print();
        System.out.println("pop out element LIFO "+obj.pop());
        obj.print();
        obj.push(8);
        obj.print();
    }
}
