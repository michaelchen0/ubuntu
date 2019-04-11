public class EndsWith{
  public static void main(String[] args){
    System.out.println(endsWith(args[0],args[1]));
  }
  public static boolean endsWith(String a, String b){
    int lengthUserStr = a.length();
    int lengthEnding = b.length();
    int diff = lengthUserStr - lengthEnding;
    System.out.println(a.substring(diff, lengthUserStr));
    System.out.println(b);
    return ((a.substring(diff, lengthUserStr)) == b);
    }
  }
