import java.util.Scanner;

class MainC {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int total = 0;
    System.out.print("Enter a sequence of integers separated by spaces: ");
    
    while (sc.hasNextInt()) {
      int num = sc.nextInt();
      total += num;
      System.out.print(total + " ");
    }
    
  }
}
