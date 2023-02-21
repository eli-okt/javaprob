import java.util.Scanner;

class MainB {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();

    for (int i = 1; i < str.length(); i+=2) {
      
      char currentChar = str.charAt(i);
      System.out.print(currentChar);
      
    }

    // int i = 0 for starting from the first letter.
    // int i = 1 for starting from the second letter.

  }
}