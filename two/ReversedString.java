import java.util.Scanner;

class ReversedString {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    
    String reversedWord = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reversedWord += str.charAt(i);
    }
    
    System.out.println("Reversed string: " + reversedWord);
    
  }
}
