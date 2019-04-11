public class GcdDemo{
  public static void main (String[] args){
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    System.out.println("the gcd is " + GCD(x,y));
    System.out.println("the lcm is " + LCM(x,y));
    System.out.println("the number of digits is " + CountDigits(x));
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
  public static int LCM(int x, int y){
    return (x * y)/GCD(x, y);
  }
  public static int CountDigits(int x){
    int z = 0;
    x = Math.abs(x);
    while (x > 0){
      x /= 10;
      z += 1;
    }
    return z;
  }}
