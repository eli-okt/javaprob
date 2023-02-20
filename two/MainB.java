import java.util.Scanner;

class MainB {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter integers (0 to quit): ");
    int num;
    int totalEven = 0;
    int totalOdd = 0;

    while ((num = sc.nextInt()) != 0) {
      if (num%2 == 0) {
        totalEven++;
      }
      if (num%2 != 0) {
        totalOdd++;
      }
    }

    System.out.println("Total number of even numbers: " + totalEven);
    System.out.println("Total number of odd numbers: " + totalOdd);
    
  }
}