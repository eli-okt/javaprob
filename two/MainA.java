import java.util.Scanner;

class MainA {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;

    System.out.println("Enter integers (0 to quit): ");
    int num;

    while ((num = sc.nextInt()) != 0) {
      if (num < smallest) {
        smallest = num;
      }
      if (num > largest) {
        largest = num;
      }
    }

    System.out.println("Smallest: " + smallest);
    System.out.println("Largest: " + largest);
  }
}
