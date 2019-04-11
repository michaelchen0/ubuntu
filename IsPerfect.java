public class IsPerfect{
  public static void main(String[] args){
    int counter = 0;
    while (counter < 10000){
    System.out.println(counter + " " + isPerfect(counter));
    counter ++;
    }
  }
    public static boolean isPerfect(int n){
    if (n == sumOfDivisors (n))
    return true;
    return false;
    }
    public static int sumOfDivisors(int n){
    int perfectCounter = 1;
    int sum = 0;
    while (perfectCounter < n){
    if ((n % perfectCounter) == 0) {
    sum += perfectCounter;
    perfectCounter += 1;
    }
    else perfectCounter +=1;
    }
    return sum;
    }
    }
