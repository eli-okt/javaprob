class MainC {
  public static void main(String[] args) {

    int sum = 0;
    
    for (int i = 20; i <= 25; i++) {
    sum += Math.pow(2, i);
    }

    System.out.println("All powers of 2 from 20 up to 25 are " + sum);
    
  }
}