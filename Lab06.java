import java.util.*;
import java.io.*;

public class Lab06{
    private Stack<E> stack1;
    private Stack<E> stack2;
    public Lab06(){
	stack1 = new Stack<E>();
	stack2 = new Stack<E>();
    public void copy(){
	while (!(stack1.isEmpty())){
	    stack2.push(stack1.pop);
	}
    }
    public void enqueue(E e){
	stack1.push(e);
    public void dequeue(){
    }
}
