public class Uniform{
  public int uniform(int n){
    double z = Math.random();
      if (z < n)
      return int(z);
    return int(z * n);
}
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    System.out.println(uniform(n));
  }
  }
