import java.util.Stack;
public class Lab5{
    public static void main(String[] args){
	
    }
    public static void roll(Stack<String> stack, int n, int k){
	if (n < 0 || k < 0 || n > stack.size()){
	    throw new RuntimeException("roll: argument out of range");
    }
	String[] str = new String[n*2];
	k = k % n;
	int i = 0;
	while (i < n){
	    str[i++] = stack.pop();
	}
	while (i < 2*n){
	    str[i] = str[i-n];
	    i++
		}
	for (int j = n-1+k;j>k-1;j++){
	    stack.push(str[j]);
	}
}
