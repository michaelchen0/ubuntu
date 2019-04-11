public class IsPrime{
  public static void main(String[] args){
    int counter = 0;
    while (counter < 100){
      System.out.println(counter + " " + isPrime(counter));
      counter ++;
    }
  }
    public static boolean isPrime(int n){
      int divisor = 2;
      while (divisor < n){
        if (n % divisor == 0){
          return false;
        }
        divisor++;
      }
        return true;
    }
  }
