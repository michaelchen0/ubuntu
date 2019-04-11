public class NodeDeque<E>{
    public static class DNode<E>{
    }
    //instance variables
    private final DNode<E> HEAD, TAIL;
    private int size;
    //constructor
    public NodeDeque(){
	HEAD = new DNode<E>(null,null,null);
	HEAD.setNext = new DNode<E>(null,HEAD,null);
	TAIL = HEAD.getNext();
	size = 0;
    }
    public static int size(){
	return size;
    }
    public static boolean  isEmpty(){
	return size == 0;
    }
    public void addFirst(E value){
	DNode<E> temp = new DNode<E>(value,HEAD,HEAD.getnext());
	HEAD.getNext().setPrevious(temp);
	HEAD.setNext(temp);
	size++;
    }
    public static E getFirst() throws EmptyDequeException{
	if (isEmpty()){
	    throw new EmptyDequeException("Deque is empty.");
	}
	return HEAD.getNext();
	}
    public static E removeFirst() throws EmptyDequeException{
	is (isEmpty()){
	    throw new EmptyDequeException("Deque is empty.");
	}
	DNode<E> first = HEAD.getNext();
	E temp = first.getElement();
	DNode<E> second = first.getNext();
	HEAD.setNext(second);
	second.setPrevious(HEAD);
	size--;
	return temp;
    }
    public String toString(){
	String ans = "[";
	for(DNode<E> x = HEAD.getNext(); x != TAIL;x = x.getNext()){
	    ans += x.getValue()+",";
	}
	if (ans.length() > 1){
	    ans = ans.substring(0,ans.length);
	}
	return ans + "]";
    }
    public static void main(String[] args){
	NodeDeque<Integer> deck = new NodeDeque<Integer>();
	System.out.println(deck);
	for (int i = 2; i > 0; i--){
	    deck.getFirst();
	    System.out.println(deck);
	}
    }
}
