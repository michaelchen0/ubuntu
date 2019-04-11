import java.util.Scanner;
public class Lab15{
  public static void main(String[] args){
    int shift = Integer.parseInt(args[1]);
    System.out.println(encodeCaesarCipher(args[0],shift));
  }
  public static String encodeCaesarCipher(String str, int shift){
    String finalStr = "";
    String alphabetCap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alphabetLower = alphabetCap.toLowerCase();
    for (int counter = 0; counter < str.length(); counter ++){
      if (alphabetCap.contains(str.substring(counter, counter + 1))){
        if (((alphabetCap.indexOf(str.substring(counter, counter + 1))) + shift) > 25){
                  finalStr += alphabetCap.charAt(counter + shift - 1);
                }
        else{
          finalStr += alphabetCap.charAt(counter + shift);
        }
      }
    }
    return finalStr;
  }
}
