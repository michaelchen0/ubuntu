import java.util.Scanner;
public class HelloName{
public void run(){
	Scanner sys = new Scanner(System.in);
	System.out.println("Enter your name: ");
	String name = sys.nextLine();
	System.out.println("Hello, " + name + "!");
}
public static void main(String[] args){
	new HelloName().run();
}
}
