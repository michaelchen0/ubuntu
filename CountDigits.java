public class CountDigits{
  public static int countDigits(int n){
    if (Math.abs(n) < 10)
      return 1;
    return countDigits(n/10) + 1;
}
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    System.out.println(countDigits(n));
  }
  }
