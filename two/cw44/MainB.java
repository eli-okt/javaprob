class MainB {
  public static void main(String[] args) {

    int sum = 0;
    
    for (int i = 1; 100 >= i*i; i++) {
      sum += i*i;
    }
    
    System.out.println("The sum of all squares between 1 and 100 is " + sum);
    
  }
}
