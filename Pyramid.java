/*
1. Spherical objects, such as cannonballs, can be stacked to form a pyramid
   with one cannonball at the top, sitting on top of a square composed of
   four cannonballs, sitting on top of a square composed of nine cannonballs,
   and so forth. Write a recursive method cannonball that takes as its
   argument the height of the pyramid and returns the number of cannonballs
   it contains. Your method must operate recursively and must not use any
   iterative constructs such as while or for.
*/
public class Pyramid{
public static void main(String[] args){
  int userInt = Integer.parseInt(args[0]);
  System.out.println(cannonball(userInt));
}
public static int cannonball(int n){
  if (n == 0)
  {
    return 0;
  }
  else
  {
    return (n * n + cannonball(n - 1));
  }
}

}
