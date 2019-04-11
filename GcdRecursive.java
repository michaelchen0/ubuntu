public class GcdRecursive{
  public static void main (String[] args){
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    System.out.println("the gcd is " + GCD(x,y));
  }
  public static int GCD(int x, int y){
    int r = x % y;
    if (r == 0){
      return y;
    }
    else{
      x = y;
      y = r;
      return GCD(x, y);
    }
  }
}
