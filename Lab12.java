public class Lab12{
  public static void main(String[] args){
    System.out.println(trim(args[0]));
    System.out.println(capitalize(args[0]));
}
  public static String trim(String n){
    int counter = 0;
    String finalStr = "";
    while (counter < n.length()){
      if (!Character.isWhitespace(n.charAt(counter)))
      {finalStr += n.charAt(counter);}
      counter ++;
    }
    return finalStr;
}
  public static String capitalize(String n){
    int counter = 0;
    String finalStr = "";
    while (counter < n.length()){
      if (counter == 0){
        finalStr += Character.toUpperCase(n.charAt(counter));
      }
      else{
        finalStr += Character.toLowerCase(n.charAt(counter));
      }
      counter ++;
    }
    return finalStr;
  }
  public static int scrabble(String n){
    int counter = 0;
    int finalScore = 0;
    while (counter < n.length()){
      if (Character.isUpperCase(n.CharAt(counter))){
        if ("A,E,I,L,N,O,R,S,T,U".contains(n.CharAt(counter))){
          finalScore ++;
        }
        if ("D,G".contains(n.CharAt(counter))){
          finalScore += 2;
        }
        if ("B,C,M,P".contains(n.CharAt(counter))){
          finalScore += 3;
        }
        if ("F,H,V,W,Y".contains(n.CharAt(counter))){
          finalScore += 4;
        }
        if ("K".contains(n.CharAt(counter))){
          finalScore += 5;
        }
        if ("J,X".contains(n.CharAt(counter))){
          finalScore += 8;
        }
        if ("Q,Z".contains(n.CharAt(counter))){
          finalScore += 10;
        }
      }
      counter ++;
    }
  }
}

/*
AP Computer Science
Period 2
Due Tomorrow
Lab-12

Rick Platek
7:32 AM (Edited 8:38 AM)
Be prepared to go over questions 1,2 and 3.

Lab-12.txt
Text
Your work
Assigned

============================================================
 *** NON AP MATERIAL ***
 Useful  methods from the String class
============================================================
	str.charAt(int) : char
        str.equalsIgnoreCase(String): Boolean
        str.compareToIgnoreCase(String) : int
        str.isEmpty() : Boolean
        str.startsWith(String) : Boolean
	str.endsWith(String) : Boolean
        str.contains(String) : Boolean
        str.lastIndexOf(String) : int
        str.lastIndexOf(String,int) : int
        str.replace(Sring old, String) : String
        str.split(String) : String
        str.toLowerCase() : String
        str.toUpperCase() : String
        str.trim() : String


=============================================================
  *** NON AP MATERIAL ***
Useful static methods from the Character class:
=============================================================
  Predicate Methods
	Character.isDigit(char) : Boolean
        Character.isLetter(char) : Boolean
        Character.isLowerCase(char) : Boolean
        Character.isUpperCase(char) : Boolean
        Character.isLetterOrDigit(char) : Boolean
        Character.isWhitespace(char) : Boolean
	Character.isJavaIdentifierStart(char) : Boolean
        Character.isJavaIdentifierPart(char) : Boolean
  Case Conversion Methods
        Character.toUpperCase(char) :  char
        Character.toLowerCase(char) :  char
2. Implement a method capitalize(str) that returns a string in which
   the initial character is capitalized (if it is a letter) and all
   other letters are converted to lowercase. Characters other than
   letters are not affected. For example, both capitalize("BOOLEAN")
   and capitalize("boolean") should return "Boolean".

3. In most word games, each letter in a word is scored according to
   its point value, which is inversely proportional to its frequency
   in English words. In Scrabble, the points are allocated as follows:

        Points      Letters
          1         A,E,I,L,N,O,R,S,T,U
          2         D,G
          3         B,C,M,P
          4         F,H,V,W,Y
          5         K
          8         J,X
         10         Q,Z

   For example, the word "FARM" is worth 9 points in Scrabble: 4 for the
   F, 1 each for A and R, and 3 for the M. Write a program that reads in
   words and prints their score in Scrabble, not counting any of the other
   bonuses that occur in the game. You should ignore any characters other
   than uppercase letters in computing the score. In particular, lowercase
   letters are assumed to represent blank lines, which can stand for any
   letter but have a score of 0.


4. An acronym is a word formed by combining, in order, the initial letters
   of a series of words. For example, the word scuba is an acronym formed
   from the first letters in self-contained underwater breathing apparatus.
   Similarly, AIDS is an acronym for Acquired Immune Deficiency Syndrome.
   Write a method acronym(String) and returns the acronym formed from that
   string. To ensure that your method treats hyphenated compounds like
   self-contained as two words, it should define the beginning of a word
   as any alphabetic character that appears either at the beginning of the
   string or after a nonalphabetic character.


5. Write a method

   	 private String removeCharacters(String str, String remove)

   that returns a new string consisting of the characters in str after
   removing all instances of the characters in remove. For example, if
   you call

       removeCharacters("counterrevolutionaries", "aeiou")

   the method should return "cntrrvltnrs", which is the original string
   after removing all of its vowels.


Lab-12.txt
Displaying Lab-12.txt.

*/
