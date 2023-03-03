import java.util.Random;

class ArrayComputations {
  public static void main(String[] args) {
    
    int[] arr = new int[10];
    Random nums = new Random();

    for (int i=0; i<arr.length; i++) {
      arr[i] = nums.nextInt(100);
    }

    
    System.out.print("even indexed elements: ");
    
    for (int i=0; i<arr.length; i+=2) {
      System.out.print(arr[i]+" ");
    }
    System.out.println(" ");
    
    
    System.out.print("every even element: ");
    
    for (int i=0; i<arr.length; i++) {
      if (arr[i]%2 == 0) {
        System.out.print(arr[i]+" ");
      }
    }
    System.out.println(" ");

    
    System.out.print("all elements in reverse order: ");

    for (int i=arr.length-1; i>=0; i--) {
      System.out.print(arr[i]+" ");
    }
    System.out.println(" ");


    System.out.println("the first and last elements: "+arr[0]+" "+arr[arr.length-1]);


    System.out.print("the biggest and smallest elements: ");

    int max = arr[0];
    int min = arr[0];
    
    for (int i=0; i<arr.length; i++) {
      
      if (arr[i]>max) {
        max = arr[i];
      }
      
      if (arr[i]<min) {
        min = arr[i];
      }
      
    }
    
    System.out.println(max + " " + min);
    
  }
}
