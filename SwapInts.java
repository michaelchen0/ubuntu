public class SwapInts{

public static void run(){
	System.out.print("enter an integer: ");
	int firstInt = sys.nextInt();
	System.out.print("enter another integer: ");
	int secondInt = sys.nextInt();
	System.out.println("Before swapping");
	System.out.println("first integer: " + firstInt);
	System.out.println("second integer: " + secondInt);
	int tempFirst = firstInt;
	int tempSecond = secondInt;
	firstInt = tempSecond;
	secondInt = tempFirst;
	System.out.println("After swapping");
	System.out.println("first integer: " + firstInt);
	System.out.println("second integer: " + secondInt);
}
	public static void main(String [] args){
		new SwapInts().run();
	}
}
