public class SqrtLoop{
  public static void main(String[] args){
    double n = Double.parseDouble(args[0]);
    double g = n / 2;
    while (g != n / g){
      g = (g + (n / g)) / 2;
    }
    System.out.println(g);
  }
}
