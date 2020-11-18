import java.util.Scanner;

public class VowelCounter {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter some text");

    String input = scan.nextLine();
    char[] letters = input.toCharArray();
    int counta = 0;
    int counte = 0;
    int counti = 0;
    int countu = 0;
    int counto = 0;

    for (char c: letters) {
      switch(c) {
        case 'a':
          counta++;
          break;
        case 'e':
          counte++;
          break;
        case 'i':
          counti++;
          break;
        case 'o':
          counto++;
          break;
        case 'u':
          countu++;
          break;
        default:
      }
    }
    System.out.println("Numbers of vowels in the String [" + input + "] is: ");
    System.out.println("There are " + counta + " a's, " + counte + " e's, " + counti + " i's "
    + counto + " o's and " + countu + " u's in this text.");
    System.out.println("The total number of vowels is: " + (counta + counte + counti + counto + countu));
  }
}
