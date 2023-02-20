import java.util.Scanner;

class MainE {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int num = sc.nextInt();
    int sum = 0;
    while (num > 0) {
      int digit = num % 10;
      if (digit % 2 != 0) {
        sum += digit;
      }
      num /= 10;
    }
    System.out.println("The sum of odd digits is " + sum);
  }
}
