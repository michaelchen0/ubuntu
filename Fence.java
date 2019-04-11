import java.util.Scanner;
public class Fence{
public static void main(String[] args){
Scanner sys = new Scanner(System.in);
System.out.println("enter a number of fence posts");
int fencePosts = sys.nextInt();
if (fencePosts < 0){
System.out.println("enter a nonnegative number");}
int counter = 0;
while (counter < fencePosts){
if (counter == 0){
System.out.print("|");
counter ++;
}
else{
System.out.print("---|");
counter ++;
}
}
System.out.println("");
}
}
