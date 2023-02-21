import java.util.Scanner;

class MainC {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();

    String replacedString = str.replaceAll("[aeiouAEIOU]", "_");
    System.out.println(replacedString);
    
  }
}
