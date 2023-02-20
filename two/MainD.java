import java.util.Scanner;

class MainD {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a sequence of integers separated by spaces: ");

    int first = sc.nextInt();
    int second;
    
    while (sc.hasNextInt()) {
      second = sc.nextInt();
      if (second == first) {
        System.out.print(second + " ");
      }
      first = second;
    }
    
  }
}