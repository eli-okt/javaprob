import java.util.Scanner;

class MainD {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value of a: ");
    int a = scanner.nextInt();
    System.out.print("Enter the value of b: ");
    int b = scanner.nextInt();
    
    int sum = 0;
    for (int i = a; i <= b; i++) {
        if (i % 2 != 0) {
            sum += i;
        }
    }
    System.out.println("The sum of all odd numbers between " + a + " and " + b + " is " + sum);

  }
}
