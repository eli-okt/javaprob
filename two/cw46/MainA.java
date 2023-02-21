import java.util.Scanner;

class MainA {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();

    for (int i = 0; i < str.length(); i++) {
      
      char currentChar = str.charAt(i);
      
      if (Character.isUpperCase(currentChar)) {
        System.out.println(currentChar);
      }
      
    }
    
    
  } 
}
