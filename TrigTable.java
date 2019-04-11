import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class TrigTable{
  public static void main(String[] args) {
    double theta = Math.toRadians(-90);
    while (theta <= Math.toRadians(90)){
      System.out.println(Math.sin(theta));
      theta += Math.toRadians(15);
    }
  }
}
