import java.util.EmptyStackException;

interface MyStack<E>{
	  public boolean empty();
	  public int size();
	  public E peek() throws EmptyStackException;
	  public void push(E val);
	  public E pop() throws EmptyStackException;
}

