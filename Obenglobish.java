public class Obenglobish{
  public static void main(String[] args){
    System.out.println(obenglobish(args[0]));
  }
  public static String obenglobish(String n){
    int lengthStr = n.length() - 1;
    int counter = 0;
    String finalStr = "";
    if (counter == 0){
      if (("aeiou").contains(n.substring(counter,counter + 1))){
        finalStr += "ob";
      }
      finalStr += n.substring(counter,counter + 1);
      counter ++;
    }
    while(counter < lengthStr){
      if (("aeiou").contains(n.substring(counter - 1,counter))){
        finalStr += n.substring(counter,counter + 1);
        counter ++;
      }
      else{
        if (("aeiou").contains(n.substring(counter,counter + 1))){
          finalStr += "ob";
        }
      finalStr += n.substring(counter,counter + 1);
      counter ++;
      }
    }
    finalStr += n.substring(counter,counter + 1);
    return finalStr;
    }
}
