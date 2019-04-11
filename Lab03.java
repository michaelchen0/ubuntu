/* 

1. Evaluate the following: 
 a. 1.0 / 0.0 : Infinity
 b. Math.sqrt(-1.0) : NaN
 c. 1.03 - 0.42 : 0.6100000000000001

2. Suppose that a and b are boolean values. 
Show that the expression (! (a && b) && (a || b)) || ((a && b) || !(a || b))
is equivalent to true.

Assume a is false and b is true or vice versa
(! (false && true) && (false || true)) || ((false && true) || !(false || true))




*/
public class Lab03{
	public static void main(String[] args){
	NumberOne();
}
	public static void NumberOne(){
	System.out.println(1.0/0.0);
	System.out.println(Math.sqrt(-1.0));
	System.out.println(1.03-0.42);
}
}

