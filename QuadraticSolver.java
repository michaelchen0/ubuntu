import java.util.Scanner;
public class QuadraticSolver{
public static void main(String[] args){
Scanner sys = new Scanner(System.in);
System.out.println("enter a");
int a = sys.nextInt();
System.out.println("enter b");
int b = sys.nextInt();
System.out.println("enter c");
int c = sys.nextInt();
int d = (b * b) - (4 * a * c);
if (d >=0) {
double firstRoot = ((-1 * b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
double secondRoot = ((-1 * b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
System.out.println("the 2 real roots are " + firstRoot + " and " + secondRoot);	
}
else{
System.out.println("discriminant is negative and there are no real roots");
}
}
}
