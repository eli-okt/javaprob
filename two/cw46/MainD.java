import java.util.Scanner;

class MainD {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();
    
    int total = 0;

    

    for (int i = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);
      
      if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' || currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
        
        total++;
        
      }
    }

    System.out.println("Number of vowels: " + total);
    
    
  } 
}
