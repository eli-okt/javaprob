public class Main {

    public static void main(String[] args) {
      
      int[] values = {1, 4, 9, 16, 25, 8, 11, 64, 100, 3};
      
      ArrayMethods arrayMethods = new ArrayMethods(values);

      arrayMethods.printArray();

      arrayMethods.swapFirstAndLast();
      arrayMethods.printArray();
      
      arrayMethods.shiftRight();
      arrayMethods.printArray();

      arrayMethods.replaceEvenWithZero();
      arrayMethods.printArray();

      arrayMethods.replaceAllWithNeighbors();
      arrayMethods.printArray();

      arrayMethods.removeMiddle();
      arrayMethods.printArray();
      
      arrayMethods.moveAllEvenToFront();
      arrayMethods.printArray();

      System.out.println(arrayMethods.getSecondLargest());
      
      System.out.println(arrayMethods.isIncreasingOrder());

      System.out.println(arrayMethods.hasTwoAdjacentDuplicate());

      System.out.println(arrayMethods.hasDuplicate());
      
    }

}
