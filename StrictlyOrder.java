import java.util.Scanner;
public class StrictlyOrder{
public static void main(String[] args){
Scanner sys = new Scanner(System.in);
System.out.println("enter any number");
double x = sys.nextDouble();
System.out.println("enter another number");
double y = sys.nextDouble();
System.out.println("enter another number");
double z = sys.nextDouble();
System.out.println(((x > y) && (y > z)) || ((x < y) && (y < z)));
}
}


