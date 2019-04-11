public class SqrtRecursion{
  public static void main(String[] args){
    double n = Double.parseDouble(args[0]);
    System.out.println(sqrt(n));
}
public static double sqrt(double g){
  double n = 0.0;
  if (g != (g + (n / g)) / 2)
  {
    g = n / 2;
    return sqrt(g);
  }
  return g;
}}
