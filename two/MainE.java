import java.util.Scanner;

class MainE {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();

    System.out.println("Here are the indexes of the vowels: ");
    
    for (int i = 0; i < str.length(); i++) {
      
      char currentChar = str.charAt(i);
      
      if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' || currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
        
        System.out.print(i+" ");
        
      }
      
    }
    
    
  } 
}